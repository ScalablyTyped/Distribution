package typings.angularCompilerCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def stringEncaseCRLFWithFirstIndex(value: String, prefix: String, postfix: String, index: Double): String = (js.Dynamic.global.applyDynamic("stringEncaseCRLFWithFirstIndex")(value.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], postfix.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def styleMessage(message: String): String = js.Dynamic.global.applyDynamic("styleMessage")(message.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSGlobal("warningMsg")
  @js.native
  val warningMsg: /* "\n\n==========================================\n\nALERT: As of Angular 16, \"ngcc\" is no longer required and not invoked during CLI builds. You are seeing this message because the current operation invoked the \"ngcc\" command directly. This \"ngcc\" invocation can be safely removed.\n\nA common reason for this is invoking \"ngcc\" from a \"postinstall\" hook in package.json.\n\nIn Angular 17, this command will be removed. Remove this and any other invocations to prevent errors in later versions.\n\n==========================================\n\n" */ String = js.native
}
