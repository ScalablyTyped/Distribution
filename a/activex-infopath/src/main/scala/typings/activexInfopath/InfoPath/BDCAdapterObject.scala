package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BDCAdapterObject extends StObject {
  
  val EntityName: String = js.native
  
  val EntityNamespace: String = js.native
  
  @JSName("InfoPath.BDCAdapterObject_typekey")
  var InfoPathDotBDCAdapterObject_typekey: BDCAdapterObject = js.native
  
  val LOBSystemInstance: String = js.native
  
  val Name: String = js.native
  
  def Query(): Unit = js.native
  
  val QueryAllowed: Boolean = js.native
  
  val SpecificFinder: String = js.native
  
  def Submit(): Unit = js.native
  
  val SubmitAdapterName: String = js.native
  
  val SubmitAllowed: Boolean = js.native
}
object BDCAdapterObject {
  
  @scala.inline
  def apply(
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
  implicit class BDCAdapterObjectMutableBuilder[Self <: BDCAdapterObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityName(value: String): Self = StObject.set(x, "EntityName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityNamespace(value: String): Self = StObject.set(x, "EntityNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoPathDotBDCAdapterObject_typekey(value: BDCAdapterObject): Self = StObject.set(x, "InfoPath.BDCAdapterObject_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLOBSystemInstance(value: String): Self = StObject.set(x, "LOBSystemInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: () => Unit): Self = StObject.set(x, "Query", js.Any.fromFunction0(value))
    
    @scala.inline
    def setQueryAllowed(value: Boolean): Self = StObject.set(x, "QueryAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecificFinder(value: String): Self = StObject.set(x, "SpecificFinder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmit(value: () => Unit): Self = StObject.set(x, "Submit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSubmitAdapterName(value: String): Self = StObject.set(x, "SubmitAdapterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitAllowed(value: Boolean): Self = StObject.set(x, "SubmitAllowed", value.asInstanceOf[js.Any])
  }
}
