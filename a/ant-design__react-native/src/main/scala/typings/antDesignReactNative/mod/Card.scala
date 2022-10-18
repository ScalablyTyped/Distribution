package typings.antDesignReactNative.mod

import typings.antDesignReactNative.anon.Full
import typings.antDesignReactNative.anon.TypeofCardBody
import typings.antDesignReactNative.anon.TypeofCardFooter
import typings.antDesignReactNative.anon.TypeofCardHeader
import typings.antDesignReactNative.libCardMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native", "Card")
@js.native
open class Card () extends default
/* static members */
object Card {
  
  @JSImport("@ant-design/react-native", "Card")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/react-native", "Card.Body")
  @js.native
  def Body: TypeofCardBody = js.native
  inline def Body_=(x: TypeofCardBody): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Body")(x.asInstanceOf[js.Any])
  
  @JSImport("@ant-design/react-native", "Card.Footer")
  @js.native
  def Footer: TypeofCardFooter = js.native
  inline def Footer_=(x: TypeofCardFooter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footer")(x.asInstanceOf[js.Any])
  
  @JSImport("@ant-design/react-native", "Card.Header")
  @js.native
  def Header: TypeofCardHeader = js.native
  inline def Header_=(x: TypeofCardHeader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
  
  @JSImport("@ant-design/react-native", "Card.defaultProps")
  @js.native
  def defaultProps: Full = js.native
  inline def defaultProps_=(x: Full): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
