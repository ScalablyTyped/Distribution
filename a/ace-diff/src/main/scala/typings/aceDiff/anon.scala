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
    
    inline def apply(
      connector: String,
      deletedCodeConnectorLinkContent: String,
      diff: String,
      newCodeConnectorLinkContent: String
    ): Connector = {
      val __obj = js.Dynamic.literal(connector = connector.asInstanceOf[js.Any], deletedCodeConnectorLinkContent = deletedCodeConnectorLinkContent.asInstanceOf[js.Any], diff = diff.asInstanceOf[js.Any], newCodeConnectorLinkContent = newCodeConnectorLinkContent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Connector]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Connector] (val x: Self) extends AnyVal {
      
      inline def setConnector(value: String): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
      
      inline def setDeletedCodeConnectorLinkContent(value: String): Self = StObject.set(x, "deletedCodeConnectorLinkContent", value.asInstanceOf[js.Any])
      
      inline def setDiff(value: String): Self = StObject.set(x, "diff", value.asInstanceOf[js.Any])
      
      inline def setNewCodeConnectorLinkContent(value: String): Self = StObject.set(x, "newCodeConnectorLinkContent", value.asInstanceOf[js.Any])
    }
  }
  
  trait Left extends StObject {
    
    var left: Any
    
    var right: Any
  }
  object Left {
    
    inline def apply(left: Any, right: Any): Left = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[Left]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Left] (val x: Self) extends AnyVal {
      
      inline def setLeft(value: Any): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Any): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
}
