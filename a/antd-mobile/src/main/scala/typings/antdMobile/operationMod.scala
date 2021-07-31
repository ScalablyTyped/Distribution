package typings.antdMobile

import typings.antdMobile.anon.Close
import typings.antdMobile.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operationMod {
  
  @JSImport("antd-mobile/lib/modal/operation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): Close = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Close]
  @scala.inline
  def default(actions: js.Array[Text]): Close = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(actions.asInstanceOf[js.Any]).asInstanceOf[Close]
  @scala.inline
  def default(actions: js.Array[Text], platform: String): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(actions.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[Close]
  @scala.inline
  def default(actions: Unit, platform: String): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(actions.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[Close]
}
