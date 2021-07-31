package typings.activexWia.WIA

import typings.activexWia.activexWiaNumbers.`0`
import typings.activexWia.activexWiaNumbers.`1`
import typings.activexWia.activexWiaNumbers.`2`
import typings.activexWia.activexWiaNumbers.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The WiaImageIntent enumeration helps specify what type of data the image is intended to represent. */
/* Rewritten from type alias, can be one of: 
  - typings.activexWia.activexWiaNumbers.`1`
  - typings.activexWia.activexWiaNumbers.`2`
  - typings.activexWia.activexWiaNumbers.`4`
  - typings.activexWia.activexWiaNumbers.`0`
*/
trait WiaImageIntent extends StObject
object WiaImageIntent {
  
  @scala.inline
  def ColorIntent: `1` = 1.asInstanceOf[`1`]
  
  @scala.inline
  def GrayscaleIntent: `2` = 2.asInstanceOf[`2`]
  
  @scala.inline
  def TextIntent: `4` = 4.asInstanceOf[`4`]
  
  @scala.inline
  def UnspecifiedIntent: `0` = 0.asInstanceOf[`0`]
}
