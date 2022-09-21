package typings.airtable

import typings.airtable.anon.ErrorPass
import typings.airtable.anon.Pass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typecheckMod {
  
  inline def apply[Value, Error](fn: js.Function1[/* value */ CheckValue, /* is Value */ Boolean], error: Error): js.Function1[/* value */ Value, Pass | ErrorPass[Error]] = (^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* value */ Value, Pass | ErrorPass[Error]]]
  
  @JSImport("airtable/lib/typecheck", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("airtable/lib/typecheck", "isArrayOf")
  @js.native
  def isArrayOf: js.Function1[
    /* itemValidator */ js.Function1[/* value */ Any, /* is any */ Boolean], 
    js.Function1[/* value */ Any, /* is std.Array<any> */ Boolean]
  ] = js.native
  inline def isArrayOf_=(
    x: js.Function1[
      /* itemValidator */ js.Function1[/* value */ Any, /* is any */ Boolean], 
      js.Function1[/* value */ Any, /* is std.Array<any> */ Boolean]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isArrayOf")(x.asInstanceOf[js.Any])
  
  @JSImport("airtable/lib/typecheck", "isOneOf")
  @js.native
  def isOneOf: js.Function1[/* options */ Any, Any] = js.native
  inline def isOneOf_=(x: js.Function1[/* options */ Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isOneOf")(x.asInstanceOf[js.Any])
  
  type CheckValue = Any
}
