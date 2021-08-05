package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubmitToHostAdapterObject extends StObject {
  
  /* private */ @JSName("InfoPath.SubmitToHostAdapterObject_typekey")
  var InfoPathDotSubmitToHostAdapterObject_typekey: SubmitToHostAdapterObject
  
  val Name: String
  
  def Query(): Unit
  
  val QueryAllowed: Boolean
  
  def Submit(): Unit
  
  val SubmitAllowed: Boolean
}
object SubmitToHostAdapterObject {
  
  inline def apply(
    InfoPathDotSubmitToHostAdapterObject_typekey: SubmitToHostAdapterObject,
    Name: String,
    Query: () => Unit,
    QueryAllowed: Boolean,
    Submit: () => Unit,
    SubmitAllowed: Boolean
  ): SubmitToHostAdapterObject = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Query = js.Any.fromFunction0(Query), QueryAllowed = QueryAllowed.asInstanceOf[js.Any], Submit = js.Any.fromFunction0(Submit), SubmitAllowed = SubmitAllowed.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.SubmitToHostAdapterObject_typekey")(InfoPathDotSubmitToHostAdapterObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitToHostAdapterObject]
  }
  
  extension [Self <: SubmitToHostAdapterObject](x: Self) {
    
    inline def setInfoPathDotSubmitToHostAdapterObject_typekey(value: SubmitToHostAdapterObject): Self = StObject.set(x, "InfoPath.SubmitToHostAdapterObject_typekey", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: () => Unit): Self = StObject.set(x, "Query", js.Any.fromFunction0(value))
    
    inline def setQueryAllowed(value: Boolean): Self = StObject.set(x, "QueryAllowed", value.asInstanceOf[js.Any])
    
    inline def setSubmit(value: () => Unit): Self = StObject.set(x, "Submit", js.Any.fromFunction0(value))
    
    inline def setSubmitAllowed(value: Boolean): Self = StObject.set(x, "SubmitAllowed", value.asInstanceOf[js.Any])
  }
}
