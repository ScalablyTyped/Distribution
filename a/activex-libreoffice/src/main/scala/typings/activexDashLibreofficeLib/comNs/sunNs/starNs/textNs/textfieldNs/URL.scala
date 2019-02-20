package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of text field that displays a {@link URL}
  * @see com.sun.star.text.TextField
  */
trait URL
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextField {
  /** Specifies how the {@link URL} is formatted on output. */
  var Format: scala.Double
  /**
    * contains the content that will be displayed to the user.
    *
    * If this string is empty, the `URL` will be shown.
    */
  var Representation: java.lang.String
  /** Specifies the frame name in that the {@link URL} will be opened */
  var TargetFrame: java.lang.String
  /**
    * contains the unparsed original {@link URL} , for example, [http://me:pass@www.sun.de:8080/pub/test/foo.txt?a=b#xyz]{@link
    * url="http://me:pass@www.sun.de:8080/pub/test/foo.txt?a=b#xyz"}
    */
  var URL: java.lang.String
}

