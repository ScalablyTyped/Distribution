package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HWSAdapterObject extends StObject {
  
  /* private */ @JSName("InfoPath.HWSAdapterObject_typekey")
  var InfoPathDotHWSAdapterObject_typekey: HWSAdapterObject
  
  val Name: String
  
  def Query(): Unit
  
  val QueryAllowed: Boolean
  
  def Submit(): Unit
  
  val SubmitAllowed: Boolean
}
object HWSAdapterObject {
  
  inline def apply(
    InfoPathDotHWSAdapterObject_typekey: HWSAdapterObject,
    Name: String,
    Query: () => Unit,
    QueryAllowed: Boolean,
    Submit: () => Unit,
    SubmitAllowed: Boolean
  ): HWSAdapterObject = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Query = js.Any.fromFunction0(Query), QueryAllowed = QueryAllowed.asInstanceOf[js.Any], Submit = js.Any.fromFunction0(Submit), SubmitAllowed = SubmitAllowed.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.HWSAdapterObject_typekey")(InfoPathDotHWSAdapterObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HWSAdapterObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HWSAdapterObject] (val x: Self) extends AnyVal {
    
    inline def setInfoPathDotHWSAdapterObject_typekey(value: HWSAdapterObject): Self = StObject.set(x, "InfoPath.HWSAdapterObject_typekey", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: () => Unit): Self = StObject.set(x, "Query", js.Any.fromFunction0(value))
    
    inline def setQueryAllowed(value: Boolean): Self = StObject.set(x, "QueryAllowed", value.asInstanceOf[js.Any])
    
    inline def setSubmit(value: () => Unit): Self = StObject.set(x, "Submit", js.Any.fromFunction0(value))
    
    inline def setSubmitAllowed(value: Boolean): Self = StObject.set(x, "SubmitAllowed", value.asInstanceOf[js.Any])
  }
}
