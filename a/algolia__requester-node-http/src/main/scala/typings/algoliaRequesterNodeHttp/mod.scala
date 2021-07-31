package typings.algoliaRequesterNodeHttp

import typings.algoliaRequesterCommon.mod.Destroyable
import typings.algoliaRequesterCommon.mod.Requester
import typings.node.httpsMod.Agent
import typings.node.httpsMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@algolia/requester-node-http", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createNodeHttpRequester(): Requester & Destroyable = ^.asInstanceOf[js.Dynamic].applyDynamic("createNodeHttpRequester")().asInstanceOf[Requester & Destroyable]
  @scala.inline
  def createNodeHttpRequester(hasUserGlobalAgentUserHttpAgentUserHttpsAgentRequesterOptions: NodeHttpRequesterOptions): Requester & Destroyable = ^.asInstanceOf[js.Dynamic].applyDynamic("createNodeHttpRequester")(hasUserGlobalAgentUserHttpAgentUserHttpsAgentRequesterOptions.asInstanceOf[js.Any]).asInstanceOf[Requester & Destroyable]
  
  trait NodeHttpRequesterOptions extends StObject {
    
    var agent: js.UndefOr[Agent | typings.node.httpMod.Agent] = js.undefined
    
    var httpAgent: js.UndefOr[typings.node.httpMod.Agent] = js.undefined
    
    var httpsAgent: js.UndefOr[Agent] = js.undefined
    
    var requesterOptions: js.UndefOr[RequestOptions] = js.undefined
  }
  object NodeHttpRequesterOptions {
    
    @scala.inline
    def apply(): NodeHttpRequesterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeHttpRequesterOptions]
    }
    
    @scala.inline
    implicit class NodeHttpRequesterOptionsMutableBuilder[Self <: NodeHttpRequesterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: Agent | typings.node.httpMod.Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setHttpAgent(value: typings.node.httpMod.Agent): Self = StObject.set(x, "httpAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpAgentUndefined: Self = StObject.set(x, "httpAgent", js.undefined)
      
      @scala.inline
      def setHttpsAgent(value: Agent): Self = StObject.set(x, "httpsAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpsAgentUndefined: Self = StObject.set(x, "httpsAgent", js.undefined)
      
      @scala.inline
      def setRequesterOptions(value: RequestOptions): Self = StObject.set(x, "requesterOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequesterOptionsUndefined: Self = StObject.set(x, "requesterOptions", js.undefined)
    }
  }
}
