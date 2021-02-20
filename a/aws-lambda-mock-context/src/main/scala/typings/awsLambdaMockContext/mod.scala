package typings.awsLambdaMockContext

import org.scalablytyped.runtime.Shortcut
import typings.awsLambda.handlerMod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("aws-lambda-mock-context", JSImport.Namespace)
  @js.native
  val ^ : js.Function1[/* options */ js.UndefOr[ContextOptions], Context] = js.native
  
  @js.native
  trait ContextOptions extends StObject {
    
    var account: js.UndefOr[String] = js.native
    
    var alias: js.UndefOr[String] = js.native
    
    var functionName: js.UndefOr[String] = js.native
    
    var functionVersion: js.UndefOr[String] = js.native
    
    var memoryLimitInMB: js.UndefOr[String] = js.native
    
    var region: js.UndefOr[String] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object ContextOptions {
    
    @scala.inline
    def apply(): ContextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextOptions]
    }
    
    @scala.inline
    implicit class ContextOptionsMutableBuilder[Self <: ContextOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
      
      @scala.inline
      def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      @scala.inline
      def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionNameUndefined: Self = StObject.set(x, "functionName", js.undefined)
      
      @scala.inline
      def setFunctionVersion(value: String): Self = StObject.set(x, "functionVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionVersionUndefined: Self = StObject.set(x, "functionVersion", js.undefined)
      
      @scala.inline
      def setMemoryLimitInMB(value: String): Self = StObject.set(x, "memoryLimitInMB", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemoryLimitInMBUndefined: Self = StObject.set(x, "memoryLimitInMB", js.undefined)
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  type _To = js.Function1[/* options */ js.UndefOr[ContextOptions], Context]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Function1[/* options */ js.UndefOr[ContextOptions], Context] = ^
}
