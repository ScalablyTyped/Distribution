package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockerDeclaration extends StObject {
  
  /**
    * Reserved for future use.
    */
  var name: BlockerName
  
  /**
    * Reserved for future use.
    */
  var `type`: BlockerType
}
object BlockerDeclaration {
  
  inline def apply(name: BlockerName, `type`: BlockerType): BlockerDeclaration = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockerDeclaration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockerDeclaration] (val x: Self) extends AnyVal {
    
    inline def setName(value: BlockerName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: BlockerType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
