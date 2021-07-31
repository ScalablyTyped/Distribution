package typings.activexLibreoffice.com_.sun.star.datatransfer

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The transferable source interface.
  * @see com.sun.star.datatransfer.XTransferable
  */
trait XTransferableSource
  extends StObject
     with XInterface {
  
  /** @returns A human presentable description of the source that created the transferable object. */
  val DataSourceDescription: String
  
  /** @returns A human presentable description of the source that created the transferable object. */
  def getDataSourceDescription(): String
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
  implicit class XTransferableSourceMutableBuilder[Self <: XTransferableSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSourceDescription(value: String): Self = StObject.set(x, "DataSourceDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDataSourceDescription(value: () => String): Self = StObject.set(x, "getDataSourceDescription", js.Any.fromFunction0(value))
  }
}
