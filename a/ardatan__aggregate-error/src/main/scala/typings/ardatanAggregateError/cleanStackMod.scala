package typings.ardatanAggregateError

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cleanStackMod {
  
  @JSImport("@ardatan/aggregate-error/cleanStack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def cleanStack(stack: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanStack")(stack.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def cleanStack(stack: String, basePath: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("cleanStack")(stack.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any])).asInstanceOf[String]
}
