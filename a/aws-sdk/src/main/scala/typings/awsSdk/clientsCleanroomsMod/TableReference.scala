package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableReference extends StObject {
  
  /**
    * If present, a reference to the AWS Glue table referred to by this table reference.
    */
  var glue: js.UndefOr[GlueTableReference] = js.undefined
}
object TableReference {
  
  inline def apply(): TableReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableReference] (val x: Self) extends AnyVal {
    
    inline def setGlue(value: GlueTableReference): Self = StObject.set(x, "glue", value.asInstanceOf[js.Any])
    
    inline def setGlueUndefined: Self = StObject.set(x, "glue", js.undefined)
  }
}
