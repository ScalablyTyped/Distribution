package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JoinColumn extends StObject {
  
  /**
    * The column to be joined.
    */
  var From: EnclosedInStringProperty
  
  /**
    * The key of the column to be joined.
    */
  var Keys: GlueStudioPathList
}
object JoinColumn {
  
  inline def apply(From: EnclosedInStringProperty, Keys: GlueStudioPathList): JoinColumn = {
    val __obj = js.Dynamic.literal(From = From.asInstanceOf[js.Any], Keys = Keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoinColumn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JoinColumn] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: EnclosedInStringProperty): Self = StObject.set(x, "From", value.asInstanceOf[js.Any])
    
    inline def setKeys(value: GlueStudioPathList): Self = StObject.set(x, "Keys", value.asInstanceOf[js.Any])
    
    inline def setKeysVarargs(value: EnclosedInStringProperties*): Self = StObject.set(x, "Keys", js.Array(value*))
  }
}
