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

