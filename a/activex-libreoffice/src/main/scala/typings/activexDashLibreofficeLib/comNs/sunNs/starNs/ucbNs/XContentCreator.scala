package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A creator for new (persistent) contents, like file system folders.
  *
  * Creation of a new (persistent) content:  1. creatabletypes = creator.queryCreatableContentsInfo() 2. choose a suitable type from creatabletypes 3.
  * newObject = creator.createNewContent( type ) 4. initialize the new object (i.e. newObject.Property1 = ...) 5. let the new content execute the command
  * "insert". That command commits the data and makes the new content persistent.
  * @author Kai Sommerfeld
  * @deprecated Deprecated  This interface is deprecated. Use {@link Content} property "CreatableContentsInfo" and command "createNewContent" instead.
  * @see XContent
  * @see XCommandProcessor
  * @version 1.0
  */
trait XContentCreator
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * creates a new content of given type.
    * @param Info the content information.
    * @returns the new content, if operation was successful.
    */
  def createNewContent(Info: ContentInfo): XContent
  /**
    * returns a list with information about the creatable contents.
    * @returns the list with information about the creatable contents.
    */
  def queryCreatableContentsInfo(): activexDashInteropLib.SafeArray[ContentInfo]
}

object XContentCreator {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    createNewContent: js.Function1[ContentInfo, XContent],
    queryCreatableContentsInfo: js.Function0[activexDashInteropLib.SafeArray[ContentInfo]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XContentCreator = {
    val __obj = js.Dynamic.literal(acquire = acquire, createNewContent = createNewContent, queryCreatableContentsInfo = queryCreatableContentsInfo, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XContentCreator]
  }
}

