package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a dictionary used in a conversion dictionary list.
  *
  * Specific implementations may put some restrictions for the dictionary or it's entries. Namely usually the order for the string pairs within a single
  * entry will be defined.
  * @see com.sun.star.linguistic2.ConversionDictionaryList
  * @see com.sun.star.linguistic2.HangulHanjaConversionDictionary
  * @see com.sun.star.linguistic2.XConversionDictionary
  * @see com.sun.star.linguistic2.XConversionPropertyType
  * @since OOo 1.1.2
  */
trait ConversionDictionary
  extends XConversionDictionary
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XFlushable
     with XConversionPropertyType

