package typings.apexJs

import typings.awsLambda.handlerMod.Callback
import typings.awsLambda.handlerMod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(fn: js.Function2[/* event */ js.Any, /* context */ Context, js.Any]): js.Function3[/* event */ js.Any, /* context */ Context, /* callback */ Callback[js.Any], Unit] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* event */ js.Any, /* context */ Context, /* callback */ Callback[js.Any], Unit]]
  
  @JSImport("apex.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
