package typings.angular.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for the $onChanges lifecycle hook
  * https://docs.angularjs.org/api/ng/service/$compile#life-cycle-hooks
  */
trait IOnChanges extends StObject {
  
  /**
    * Called whenever one-way bindings are updated. The onChangesObj is a hash whose keys are the names of the bound
    * properties that have changed, and the values are an {@link IChangesObject} object  of the form
    * { currentValue, previousValue, isFirstChange() }. Use this hook to trigger updates within a component such as
    * cloning the bound value to prevent accidental mutation of the outer value.
    */
  @JSName("$onChanges")
  def $onChanges(onChangesObj: IOnChangesObject): Unit
}
object IOnChanges {
  
  @scala.inline
  def apply($onChanges: IOnChangesObject => Unit): IOnChanges = {
    val __obj = js.Dynamic.literal($onChanges = js.Any.fromFunction1($onChanges))
    __obj.asInstanceOf[IOnChanges]
  }
  
  @scala.inline
  implicit class IOnChangesMutableBuilder[Self <: IOnChanges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$onChanges(value: IOnChangesObject => Unit): Self = StObject.set(x, "$onChanges", js.Any.fromFunction1(value))
  }
}
