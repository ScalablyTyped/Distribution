package typings.ajv.distTypesMod

import typings.ajv.ajvBooleans.`true`
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.ajv.distTypesMod.AnyValidateFunction because Already inherited */ @js.native
trait AsyncValidateFunction[T]
  extends StObject
     with ValidateFunction[T] {
  
  def apply(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ValidateFunction<T>> is not an array type */ args: Parameters[ValidateFunction[T]]
  ): js.Promise[T] = js.native
  
  @JSName("$async")
  var $async: `true` = js.native
}
