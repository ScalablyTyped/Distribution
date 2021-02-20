package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a dispatch statement from a recorded macro
  * @since OOo 1.1.2
  */
@js.native
trait DispatchStatement extends StObject {
  
  /**
    * specifies the dispatch command arguments
    *
    * That means the **Arguments** parameter of a corresponding {@link XDispatch.dispatch()} request.
    */
  var aArgs: SafeArray[PropertyValue] = js.native
  
  /**
    * specifies the dispatch command
    *
    * That means the **URL** parameter of a corresponding {@link XDispatchProvider.queryDispatch()} request.
    */
  var aCommand: String = js.native
  
  /**
    * specifies the frame target
    *
    * That means the **TargetFrameName** parameter of a corresponding {@link XDispatchProvider.queryDispatch()} request.
    */
  var aTarget: String = js.native
  
  /**
    * specifies if this statement should be recorded as commented out or not
    * @see XDispatchRecorder.recordDispatchAsComment()
    */
  var bIsComment: Boolean = js.native
  
  /**
    * specifies the optional search flags
    *
    * That means the **SearchFlags** parameter of a corresponding {@link XDispatchProvider.queryDispatch()} request.
    */
  var nFlags: Double = js.native
}
object DispatchStatement {
  
  @scala.inline
  def apply(
    aArgs: SafeArray[PropertyValue],
    aCommand: String,
    aTarget: String,
    bIsComment: Boolean,
    nFlags: Double
  ): DispatchStatement = {
    val __obj = js.Dynamic.literal(aArgs = aArgs.asInstanceOf[js.Any], aCommand = aCommand.asInstanceOf[js.Any], aTarget = aTarget.asInstanceOf[js.Any], bIsComment = bIsComment.asInstanceOf[js.Any], nFlags = nFlags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DispatchStatement]
  }
  
  @scala.inline
  implicit class DispatchStatementMutableBuilder[Self <: DispatchStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAArgs(value: SafeArray[PropertyValue]): Self = StObject.set(x, "aArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setACommand(value: String): Self = StObject.set(x, "aCommand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setATarget(value: String): Self = StObject.set(x, "aTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBIsComment(value: Boolean): Self = StObject.set(x, "bIsComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNFlags(value: Double): Self = StObject.set(x, "nFlags", value.asInstanceOf[js.Any])
  }
}
