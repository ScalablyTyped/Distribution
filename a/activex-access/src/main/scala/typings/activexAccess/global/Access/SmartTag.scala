package typings.activexAccess.global.Access

import typings.activexAccess.Access.SmartTagActions
import typings.activexAccess.Access.SmartTagProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Access.SmartTag")
@js.native
/* private */ open class SmartTag ()
  extends StObject
     with typings.activexAccess.Access.SmartTag {
  
  /* private */ /* CompleteClass */
  @JSName("Access.SmartTag_typekey")
  var AccessDotSmartTag_typekey: typings.activexAccess.Access.SmartTag = js.native
  
  /* CompleteClass */
  override val Application: typings.activexAccess.Access.Application = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  override def IsMemberSafe(dispid: Double): Boolean = js.native
  
  /* CompleteClass */
  override val IsMissing: Boolean = js.native
  
  /* CompleteClass */
  override val Name: String = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override def Properties(Index: String): typings.activexAccess.Access.SmartTagProperty = js.native
  /* CompleteClass */
  override def Properties(Index: Double): typings.activexAccess.Access.SmartTagProperty = js.native
  /* CompleteClass */
  @JSName("Properties")
  override val Properties_Original: SmartTagProperties = js.native
  
  /* CompleteClass */
  override def SmartTagActions(Index: String): typings.activexAccess.Access.SmartTagAction = js.native
  /* CompleteClass */
  override def SmartTagActions(Index: Double): typings.activexAccess.Access.SmartTagAction = js.native
  /* CompleteClass */
  @JSName("SmartTagActions")
  override val SmartTagActions_Original: SmartTagActions = js.native
  
  /* CompleteClass */
  override val XML: String = js.native
}
