package typings.angularUiTree

import typings.angularUiTree.AngularUITree.IParentTreeNodeScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Index extends StObject {
    
    var index: Double
    
    var nodesScope: IParentTreeNodeScope
  }
  object Index {
    
    inline def apply(index: Double, nodesScope: IParentTreeNodeScope): Index = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], nodesScope = nodesScope.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    extension [Self <: Index](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setNodesScope(value: IParentTreeNodeScope): Self = StObject.set(x, "nodesScope", value.asInstanceOf[js.Any])
    }
  }
}
