package typings.ajv.distTypesMod

import typings.ajv.anon.PartialErrorObjectstringR
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataValidateFunction extends StObject {
  
  def apply(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ValidateFunction> is not an array type */ args: Parameters[ValidateFunction[Any]]
  ): Boolean | js.Promise[Any] = js.native
  
  var errors: js.UndefOr[js.Array[PartialErrorObjectstringR]] = js.native
}
