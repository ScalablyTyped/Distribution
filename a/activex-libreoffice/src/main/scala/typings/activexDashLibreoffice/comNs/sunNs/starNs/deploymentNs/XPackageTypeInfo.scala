package typings.activexDashLibreoffice.comNs.sunNs.starNs.deploymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Objects of this interface provide information about a package's type.
  * @since OOo 2.0
  */
trait XPackageTypeInfo extends js.Object {
  /**
    * returns a description string to describe a package type.
    * @returns description
    */
  val Description: String
  /**
    * returns a file filter string for the file picker user interface. Both, the short description string and file filter string will be passed to {@link
    * com.sun.star.ui.dialogs.XFilterManager.appendFilter()} .
    * @returns file filter string
    */
  val FileFilter: String
  /**
    * returns the media type of a package, e.g. `application/vnd.sun.star.basic-script` .
    * @returns media type of package
    */
  val MediaType: String
  /**
    * returns a short description string to describe a package type (one line only).
    * @returns description
    */
  val ShortDescription: String
  /**
    * returns a description string to describe a package type.
    * @returns description
    */
  def getDescription(): String
  /**
    * returns a file filter string for the file picker user interface. Both, the short description string and file filter string will be passed to {@link
    * com.sun.star.ui.dialogs.XFilterManager.appendFilter()} .
    * @returns file filter string
    */
  def getFileFilter(): String
  /**
    * returns an icon for a package.
    * @param highContrast return high contrast icon
    * @param smallIcon return a small icon (e.g. 16x16 pixel), else return a big one (e.g. 26x26 pixel)
    * @returns currently an unsigned short (resource id for deploymentgui resource file), `VOID` any if none is available
    */
  def getIcon(highContrast: Boolean, smallIcon: Boolean): js.Any
  /**
    * returns the media type of a package, e.g. `application/vnd.sun.star.basic-script` .
    * @returns media type of package
    */
  def getMediaType(): String
  /**
    * returns a short description string to describe a package type (one line only).
    * @returns description
    */
  def getShortDescription(): String
}

object XPackageTypeInfo {
  @scala.inline
  def apply(
    Description: String,
    FileFilter: String,
    MediaType: String,
    ShortDescription: String,
    getDescription: () => String,
    getFileFilter: () => String,
    getIcon: (Boolean, Boolean) => js.Any,
    getMediaType: () => String,
    getShortDescription: () => String
  ): XPackageTypeInfo = {
    val __obj = js.Dynamic.literal(Description = Description, FileFilter = FileFilter, MediaType = MediaType, ShortDescription = ShortDescription, getDescription = js.Any.fromFunction0(getDescription), getFileFilter = js.Any.fromFunction0(getFileFilter), getIcon = js.Any.fromFunction2(getIcon), getMediaType = js.Any.fromFunction0(getMediaType), getShortDescription = js.Any.fromFunction0(getShortDescription))
  
    __obj.asInstanceOf[XPackageTypeInfo]
  }
}

