package typings.awsSdk

import typings.awsSdk.chainableTemporaryCredentialsMod.ChainableTemporaryCredentials.ChainableTemporaryCredentialsOptions
import typings.awsSdk.credentialsMod.Credentials
import typings.awsSdk.stsMod.AssumeRoleRequest
import typings.awsSdk.stsMod.ClientConfiguration
import typings.awsSdk.stsMod.GetSessionTokenRequest
import typings.awsSdk.stsMod.^
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chainableTemporaryCredentialsMod {
  
  @JSImport("aws-sdk/lib/credentials/chainable_temporary_credentials", "ChainableTemporaryCredentials")
  @js.native
  /**
    * Creates a new temporary credentials object.
    */
  class ChainableTemporaryCredentials () extends Credentials {
    def this(options: ChainableTemporaryCredentialsOptions) = this()
    
    /**
      * The STS service instance used to get and refresh temporary credentials from AWS STS.
      */
    val service: ^ = js.native
  }
  // Needed to expose interfaces on the class
  object ChainableTemporaryCredentials {
    
    trait ChainableTemporaryCredentialsOptions extends StObject {
      
      var masterCredentials: js.UndefOr[Credentials] = js.undefined
      
      var params: js.UndefOr[AssumeRoleRequest | GetSessionTokenRequest] = js.undefined
      
      var stsConfig: js.UndefOr[ClientConfiguration] = js.undefined
      
      var tokenCodeFn: js.UndefOr[
            js.Function2[
              /* serialNumber */ String, 
              /* callback */ js.Function2[/* err */ js.UndefOr[Error], /* token */ js.UndefOr[String], Unit], 
              Unit
            ]
          ] = js.undefined
    }
    object ChainableTemporaryCredentialsOptions {
      
      @scala.inline
      def apply(): ChainableTemporaryCredentialsOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ChainableTemporaryCredentialsOptions]
      }
      
      @scala.inline
      implicit class ChainableTemporaryCredentialsOptionsMutableBuilder[Self <: ChainableTemporaryCredentialsOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMasterCredentials(value: Credentials): Self = StObject.set(x, "masterCredentials", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMasterCredentialsUndefined: Self = StObject.set(x, "masterCredentials", js.undefined)
        
        @scala.inline
        def setParams(value: AssumeRoleRequest | GetSessionTokenRequest): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
        
        @scala.inline
        def setStsConfig(value: ClientConfiguration): Self = StObject.set(x, "stsConfig", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStsConfigUndefined: Self = StObject.set(x, "stsConfig", js.undefined)
        
        @scala.inline
        def setTokenCodeFn(
          value: (/* serialNumber */ String, /* callback */ js.Function2[/* err */ js.UndefOr[Error], /* token */ js.UndefOr[String], Unit]) => Unit
        ): Self = StObject.set(x, "tokenCodeFn", js.Any.fromFunction2(value))
        
        @scala.inline
        def setTokenCodeFnUndefined: Self = StObject.set(x, "tokenCodeFn", js.undefined)
      }
    }
  }
}
