package typings.antdMobile.mod

import typings.antdMobile.anon.Full
import typings.antdMobile.anon.TypeofCardBody
import typings.antdMobile.anon.TypeofCardFooter
import typings.antdMobile.anon.TypeofCardHeader
import typings.antdMobile.cardMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile", "Card")
@js.native
class Card () extends default
/* static members */
object Card {
  
  @JSImport("antd-mobile", "Card")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd-mobile", "Card.Body")
  @js.native
  def Body: TypeofCardBody = js.native
  inline def Body_=(x: TypeofCardBody): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Body")(x.asInstanceOf[js.Any])
  
  @JSImport("antd-mobile", "Card.Footer")
  @js.native
  def Footer: TypeofCardFooter = js.native
  inline def Footer_=(x: TypeofCardFooter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footer")(x.asInstanceOf[js.Any])
  
  @JSImport("antd-mobile", "Card.Header")
  @js.native
  def Header: TypeofCardHeader = js.native
  inline def Header_=(x: TypeofCardHeader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
  
  @JSImport("antd-mobile", "Card.defaultProps")
  @js.native
  def defaultProps: Full = js.native
  inline def defaultProps_=(x: Full): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
