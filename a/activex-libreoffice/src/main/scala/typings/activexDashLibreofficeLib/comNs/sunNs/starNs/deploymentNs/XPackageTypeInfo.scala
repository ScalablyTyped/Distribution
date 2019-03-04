package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.deploymentNs

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
  val Description: java.lang.String
  /**
    * returns a file filter string for the file picker user interface. Both, the short description string and file filter string will be passed to {@link
    * com.sun.star.ui.dialogs.XFilterManager.appendFilter()} .
    * @returns file filter string
    */
  val FileFilter: java.lang.String
  /**
    * returns the media type of a package, e.g. `application/vnd.sun.star.basic-script` .
    * @returns media type of package
    */
  val MediaType: java.lang.String
  /**
    * returns a short description string to describe a package type (one line only).
    * @returns description
    */
  val ShortDescription: java.lang.String
  /**
    * returns a description string to describe a package type.
    * @returns description
    */
  def getDescription(): java.lang.String
  /**
    * returns a file filter string for the file picker user interface. Both, the short description string and file filter string will be passed to {@link
    * com.sun.star.ui.dialogs.XFilterManager.appendFilter()} .
    * @returns file filter string
    */
  def getFileFilter(): java.lang.String
  /**
    * returns an icon for a package.
    * @param highContrast return high contrast icon
    * @param smallIcon return a small icon (e.g. 16x16 pixel), else return a big one (e.g. 26x26 pixel)
    * @returns currently an unsigned short (resource id for deploymentgui resource file), `VOID` any if none is available
    */
  def getIcon(highContrast: scala.Boolean, smallIcon: scala.Boolean): js.Any
  /**
    * returns the media type of a package, e.g. `application/vnd.sun.star.basic-script` .
    * @returns media type of package
    */
  def getMediaType(): java.lang.String
  /**
    * returns a short description string to describe a package type (one line only).
    * @returns description
    */
  def getShortDescription(): java.lang.String
}

object XPackageTypeInfo {
  @scala.inline
  def apply(
    Description: java.lang.String,
    FileFilter: java.lang.String,
    MediaType: java.lang.String,
    ShortDescription: java.lang.String,
    getDescription: js.Function0[java.lang.String],
    getFileFilter: js.Function0[java.lang.String],
    getIcon: js.Function2[scala.Boolean, scala.Boolean, js.Any],
    getMediaType: js.Function0[java.lang.String],
    getShortDescription: js.Function0[java.lang.String]
  ): XPackageTypeInfo = {
    val __obj = js.Dynamic.literal(Description = Description, FileFilter = FileFilter, MediaType = MediaType, ShortDescription = ShortDescription, getDescription = getDescription, getFileFilter = getFileFilter, getIcon = getIcon, getMediaType = getMediaType, getShortDescription = getShortDescription)
  
    __obj.asInstanceOf[XPackageTypeInfo]
  }
}

