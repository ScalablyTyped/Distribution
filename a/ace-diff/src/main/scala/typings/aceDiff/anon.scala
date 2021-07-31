package typings.aceDiff

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Connector extends StObject {
    
    var connector: String
    
    var deletedCodeConnectorLinkContent: String
    
    var diff: String
    
    var newCodeConnectorLinkContent: String
  }
  object Connector {
    
    @scala.inline
    def apply(
      connector: String,
      deletedCodeConnectorLinkContent: String,
      diff: String,
      newCodeConnectorLinkContent: String
    ): Connector = {
      val __obj = js.Dynamic.literal(connector = connector.asInstanceOf[js.Any], deletedCodeConnectorLinkContent = deletedCodeConnectorLinkContent.asInstanceOf[js.Any], diff = diff.asInstanceOf[js.Any], newCodeConnectorLinkContent = newCodeConnectorLinkContent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Connector]
    }
    
    @scala.inline
    implicit class ConnectorMutableBuilder[Self <: Connector] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnector(value: String): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeletedCodeConnectorLinkContent(value: String): Self = StObject.set(x, "deletedCodeConnectorLinkContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiff(value: String): Self = StObject.set(x, "diff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewCodeConnectorLinkContent(value: String): Self = StObject.set(x, "newCodeConnectorLinkContent", value.asInstanceOf[js.Any])
    }
  }
  
  trait Left extends StObject {
    
    var left: js.Any
    
    var right: js.Any
  }
  object Left {
    
    @scala.inline
    def apply(left: js.Any, right: js.Any): Left = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[Left]
    }
    
    @scala.inline
    implicit class LeftMutableBuilder[Self <: Left] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeft(value: js.Any): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: js.Any): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
}
