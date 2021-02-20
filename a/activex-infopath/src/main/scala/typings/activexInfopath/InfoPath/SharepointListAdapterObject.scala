package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharepointListAdapterObject extends StObject {
  
  @JSName("InfoPath.SharepointListAdapterObject_typekey")
  var InfoPathDotSharepointListAdapterObject_typekey: SharepointListAdapterObject = js.native
  
  val Name: String = js.native
  
  def Query(): Unit = js.native
  
  val QueryAllowed: Boolean = js.native
  
  val SiteUrl: String = js.native
  
  def Submit(): Unit = js.native
  
  val SubmitAllowed: Boolean = js.native
}
object SharepointListAdapterObject {
  
  @scala.inline
  def apply(
    InfoPathDotSharepointListAdapterObject_typekey: SharepointListAdapterObject,
    Name: String,
    Query: () => Unit,
    QueryAllowed: Boolean,
    SiteUrl: String,
    Submit: () => Unit,
    SubmitAllowed: Boolean
  ): SharepointListAdapterObject = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Query = js.Any.fromFunction0(Query), QueryAllowed = QueryAllowed.asInstanceOf[js.Any], SiteUrl = SiteUrl.asInstanceOf[js.Any], Submit = js.Any.fromFunction0(Submit), SubmitAllowed = SubmitAllowed.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.SharepointListAdapterObject_typekey")(InfoPathDotSharepointListAdapterObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharepointListAdapterObject]
  }
  
  @scala.inline
  implicit class SharepointListAdapterObjectMutableBuilder[Self <: SharepointListAdapterObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfoPathDotSharepointListAdapterObject_typekey(value: SharepointListAdapterObject): Self = StObject.set(x, "InfoPath.SharepointListAdapterObject_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: () => Unit): Self = StObject.set(x, "Query", js.Any.fromFunction0(value))
    
    @scala.inline
    def setQueryAllowed(value: Boolean): Self = StObject.set(x, "QueryAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteUrl(value: String): Self = StObject.set(x, "SiteUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmit(value: () => Unit): Self = StObject.set(x, "Submit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSubmitAllowed(value: Boolean): Self = StObject.set(x, "SubmitAllowed", value.asInstanceOf[js.Any])
  }
}
