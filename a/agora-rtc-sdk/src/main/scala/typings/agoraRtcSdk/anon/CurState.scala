package typings.agoraRtcSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurState extends StObject {
  
  /** The current connection state. */
  var curState: String = js.native
  
  /**  The previous connection state. */
  var prevState: String = js.native
}
object CurState {
  
  @scala.inline
  def apply(curState: String, prevState: String): CurState = {
    val __obj = js.Dynamic.literal(curState = curState.asInstanceOf[js.Any], prevState = prevState.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurState]
  }
  
  @scala.inline
  implicit class CurStateMutableBuilder[Self <: CurState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurState(value: String): Self = StObject.set(x, "curState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevState(value: String): Self = StObject.set(x, "prevState", value.asInstanceOf[js.Any])
  }
}
