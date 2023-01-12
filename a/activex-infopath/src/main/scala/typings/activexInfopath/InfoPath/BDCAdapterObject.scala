package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BDCAdapterObject extends StObject {
  
  val EntityName: String
  
  val EntityNamespace: String
  
  /* private */ @JSName("InfoPath.BDCAdapterObject_typekey")
  var InfoPathDotBDCAdapterObject_typekey: BDCAdapterObject
  
  val LOBSystemInstance: String
  
  val Name: String
  
  def Query(): Unit
  
  val QueryAllowed: Boolean
  
  val SpecificFinder: String
  
  def Submit(): Unit
  
  val SubmitAdapterName: String
  
  val SubmitAllowed: Boolean
}
object BDCAdapterObject {
  
  inline def apply(
    EntityName: String,
    EntityNamespace: String,
    InfoPathDotBDCAdapterObject_typekey: BDCAdapterObject,
    LOBSystemInstance: String,
    Name: String,
    Query: () => Unit,
    QueryAllowed: Boolean,
    SpecificFinder: String,
    Submit: () => Unit,
    SubmitAdapterName: String,
    SubmitAllowed: Boolean
  ): BDCAdapterObject = {
    val __obj = js.Dynamic.literal(EntityName = EntityName.asInstanceOf[js.Any], EntityNamespace = EntityNamespace.asInstanceOf[js.Any], LOBSystemInstance = LOBSystemInstance.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Query = js.Any.fromFunction0(Query), QueryAllowed = QueryAllowed.asInstanceOf[js.Any], SpecificFinder = SpecificFinder.asInstanceOf[js.Any], Submit = js.Any.fromFunction0(Submit), SubmitAdapterName = SubmitAdapterName.asInstanceOf[js.Any], SubmitAllowed = SubmitAllowed.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.BDCAdapterObject_typekey")(InfoPathDotBDCAdapterObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BDCAdapterObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BDCAdapterObject] (val x: Self) extends AnyVal {
    
    inline def setEntityName(value: String): Self = StObject.set(x, "EntityName", value.asInstanceOf[js.Any])
    
    inline def setEntityNamespace(value: String): Self = StObject.set(x, "EntityNamespace", value.asInstanceOf[js.Any])
    
    inline def setInfoPathDotBDCAdapterObject_typekey(value: BDCAdapterObject): Self = StObject.set(x, "InfoPath.BDCAdapterObject_typekey", value.asInstanceOf[js.Any])
    
    inline def setLOBSystemInstance(value: String): Self = StObject.set(x, "LOBSystemInstance", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: () => Unit): Self = StObject.set(x, "Query", js.Any.fromFunction0(value))
    
    inline def setQueryAllowed(value: Boolean): Self = StObject.set(x, "QueryAllowed", value.asInstanceOf[js.Any])
    
    inline def setSpecificFinder(value: String): Self = StObject.set(x, "SpecificFinder", value.asInstanceOf[js.Any])
    
    inline def setSubmit(value: () => Unit): Self = StObject.set(x, "Submit", js.Any.fromFunction0(value))
    
    inline def setSubmitAdapterName(value: String): Self = StObject.set(x, "SubmitAdapterName", value.asInstanceOf[js.Any])
    
    inline def setSubmitAllowed(value: Boolean): Self = StObject.set(x, "SubmitAllowed", value.asInstanceOf[js.Any])
  }
}
