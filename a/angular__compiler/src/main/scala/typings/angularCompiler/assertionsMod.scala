package typings.angularCompiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assertionsMod {
  
  @JSImport("@angular/compiler/src/assertions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def assertArrayOfStrings(identifier: String, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertArrayOfStrings")(identifier.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def assertInterpolationSymbols(identifier: String, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertInterpolationSymbols")(identifier.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
