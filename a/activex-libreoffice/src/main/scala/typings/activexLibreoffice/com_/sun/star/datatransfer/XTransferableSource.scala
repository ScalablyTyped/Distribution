package typings.activexLibreoffice.com_.sun.star.datatransfer

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The transferable source interface.
  * @see com.sun.star.datatransfer.XTransferable
  */
@js.native
trait XTransferableSource extends XInterface {
  /** @returns A human presentable description of the source that created the transferable object. */
  val DataSourceDescription: String = js.native
  /** @returns A human presentable description of the source that created the transferable object. */
  def getDataSourceDescription(): String = js.native
}

object XTransferableSource {
  @scala.inline
  def apply(
    DataSourceDescription: String,
    acquire: () => Unit,
    getDataSourceDescription: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTransferableSource = {
    val __obj = js.Dynamic.literal(DataSourceDescription = DataSourceDescription.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDataSourceDescription = js.Any.fromFunction0(getDataSourceDescription), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTransferableSource]
  }
  @scala.inline
  implicit class XTransferableSourceOps[Self <: XTransferableSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataSourceDescription(value: String): Self = this.set("DataSourceDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetDataSourceDescription(value: () => String): Self = this.set("getDataSourceDescription", js.Any.fromFunction0(value))
  }
  
}

