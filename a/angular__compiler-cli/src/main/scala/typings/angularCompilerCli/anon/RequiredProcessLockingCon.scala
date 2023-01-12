package typings.angularCompilerCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<@angular/compiler-cli.@angular/compiler-cli/ngcc/src/packages/configuration.ProcessLockingConfiguration> */
trait RequiredProcessLockingCon extends StObject {
  
  var retryAttempts: Double
  
  var retryDelay: Double
}
object RequiredProcessLockingCon {
  
  inline def apply(retryAttempts: Double, retryDelay: Double): RequiredProcessLockingCon = {
    val __obj = js.Dynamic.literal(retryAttempts = retryAttempts.asInstanceOf[js.Any], retryDelay = retryDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredProcessLockingCon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequiredProcessLockingCon] (val x: Self) extends AnyVal {
    
    inline def setRetryAttempts(value: Double): Self = StObject.set(x, "retryAttempts", value.asInstanceOf[js.Any])
    
    inline def setRetryDelay(value: Double): Self = StObject.set(x, "retryDelay", value.asInstanceOf[js.Any])
  }
}
