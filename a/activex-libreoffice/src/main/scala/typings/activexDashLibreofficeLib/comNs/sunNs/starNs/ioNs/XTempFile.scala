package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface offers access to temp files. */
trait XTempFile
  extends XStream
     with XSeekable {
  /** This attribute controls whether the file will be automatically removed on object destruction. */
  var RemoveFile: scala.Boolean
  /** This attribute specifies the temp file name. */
  var ResourceName: java.lang.String
  /** This attribute specifies the URL of the temp file. */
  var Uri: java.lang.String
}

object XTempFile {
  @scala.inline
  def apply(
    InputStream: XInputStream,
    Length: scala.Double,
    OutputStream: XOutputStream,
    Position: scala.Double,
    RemoveFile: scala.Boolean,
    ResourceName: java.lang.String,
    Uri: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getInputStream: js.Function0[XInputStream],
    getLength: js.Function0[scala.Double],
    getOutputStream: js.Function0[XOutputStream],
    getPosition: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    seek: js.Function1[scala.Double, scala.Unit]
  ): XTempFile = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("InputStream")(InputStream)
    __obj.updateDynamic("Length")(Length)
    __obj.updateDynamic("OutputStream")(OutputStream)
    __obj.updateDynamic("Position")(Position)
    __obj.updateDynamic("RemoveFile")(RemoveFile)
    __obj.updateDynamic("ResourceName")(ResourceName)
    __obj.updateDynamic("Uri")(Uri)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getInputStream")(getInputStream)
    __obj.updateDynamic("getLength")(getLength)
    __obj.updateDynamic("getOutputStream")(getOutputStream)
    __obj.updateDynamic("getPosition")(getPosition)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("seek")(seek)
    __obj.asInstanceOf[XTempFile]
  }
}

