package typings.antdMobile

import typings.antdMobile.anon.Close
import typings.antdMobile.anon.Text
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alertMod {
  
  @JSImport("antd-mobile/lib/modal/alert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(title: ReactNode, message: ReactNode): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Close]
  inline def default(title: ReactNode, message: ReactNode, actions: js.Array[Text]): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], actions.asInstanceOf[js.Any])).asInstanceOf[Close]
  inline def default(title: ReactNode, message: ReactNode, actions: js.Array[Text], platform: String): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], actions.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[Close]
  inline def default(title: ReactNode, message: ReactNode, actions: Unit, platform: String): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], actions.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[Close]
}
