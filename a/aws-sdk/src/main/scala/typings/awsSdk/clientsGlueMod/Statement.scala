package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Statement extends StObject {
  
  /**
    * The execution code of the statement.
    */
  var Code: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The unix time and date that the job definition was completed.
    */
  var CompletedOn: js.UndefOr[LongValue] = js.undefined
  
  /**
    * The ID of the statement.
    */
  var Id: js.UndefOr[IntegerValue] = js.undefined
  
  /**
    * The output in JSON.
    */
  var Output: js.UndefOr[StatementOutput] = js.undefined
  
  /**
    * The code execution progress.
    */
  var Progress: js.UndefOr[DoubleValue] = js.undefined
  
  /**
    * The unix time and date that the job definition was started.
    */
  var StartedOn: js.UndefOr[LongValue] = js.undefined
  
  /**
    * The state while request is actioned.
    */
  var State: js.UndefOr[StatementState] = js.undefined
}
object Statement {
  
  inline def apply(): Statement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Statement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Statement] (val x: Self) extends AnyVal {
    
    inline def setCode(value: GenericString): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setCompletedOn(value: LongValue): Self = StObject.set(x, "CompletedOn", value.asInstanceOf[js.Any])
    
    inline def setCompletedOnUndefined: Self = StObject.set(x, "CompletedOn", js.undefined)
    
    inline def setId(value: IntegerValue): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setOutput(value: StatementOutput): Self = StObject.set(x, "Output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "Output", js.undefined)
    
    inline def setProgress(value: DoubleValue): Self = StObject.set(x, "Progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "Progress", js.undefined)
    
    inline def setStartedOn(value: LongValue): Self = StObject.set(x, "StartedOn", value.asInstanceOf[js.Any])
    
    inline def setStartedOnUndefined: Self = StObject.set(x, "StartedOn", js.undefined)
    
    inline def setState(value: StatementState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
