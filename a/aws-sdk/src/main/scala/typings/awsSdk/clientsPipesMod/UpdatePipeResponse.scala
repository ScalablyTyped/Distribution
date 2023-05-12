package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePipeResponse extends StObject {
  
  /**
    * The ARN of the pipe.
    */
  var Arn: js.UndefOr[PipeArn] = js.undefined
  
  /**
    * The time the pipe was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The state the pipe is in.
    */
  var CurrentState: js.UndefOr[PipeState] = js.undefined
  
  /**
    * The state the pipe should be in.
    */
  var DesiredState: js.UndefOr[RequestedPipeState] = js.undefined
  
  /**
    * When the pipe was last updated, in ISO-8601 format (YYYY-MM-DDThh:mm:ss.sTZD).
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the pipe.
    */
  var Name: js.UndefOr[PipeName] = js.undefined
}
object UpdatePipeResponse {
  
  inline def apply(): UpdatePipeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePipeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdatePipeResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: PipeArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setCurrentState(value: PipeState): Self = StObject.set(x, "CurrentState", value.asInstanceOf[js.Any])
    
    inline def setCurrentStateUndefined: Self = StObject.set(x, "CurrentState", js.undefined)
    
    inline def setDesiredState(value: RequestedPipeState): Self = StObject.set(x, "DesiredState", value.asInstanceOf[js.Any])
    
    inline def setDesiredStateUndefined: Self = StObject.set(x, "DesiredState", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setName(value: PipeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
