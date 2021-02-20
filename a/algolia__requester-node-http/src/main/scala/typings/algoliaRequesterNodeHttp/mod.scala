package typings.algoliaRequesterNodeHttp

import typings.algoliaRequesterCommon.mod.Destroyable
import typings.algoliaRequesterCommon.mod.Requester
import typings.node.httpsMod.Agent
import typings.node.httpsMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@algolia/requester-node-http", "createNodeHttpRequester")
  @js.native
  def createNodeHttpRequester(): Requester with Destroyable = js.native
  @JSImport("@algolia/requester-node-http", "createNodeHttpRequester")
  @js.native
  def createNodeHttpRequester(hasAgentHttpAgentHttpsAgentRequesterOptions: NodeHttpRequesterOptions): Requester with Destroyable = js.native
  
  @js.native
  trait NodeHttpRequesterOptions extends StObject {
    
    var agent: js.UndefOr[Agent | typings.node.httpMod.Agent] = js.native
    
    var httpAgent: js.UndefOr[typings.node.httpMod.Agent] = js.native
    
    var httpsAgent: js.UndefOr[Agent] = js.native
    
    var requesterOptions: js.UndefOr[RequestOptions] = js.native
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
