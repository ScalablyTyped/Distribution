package typings.agGrid

import typings.agGrid.dateFilterMod.IDateFilterParams
import typings.agGrid.iComponentMod.IComponent
import typings.std.Date
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateComponentMod {
  
  trait IDate extends StObject {
    
    /** Returns the current date represented by this editor */
    def getDate(): Date
    
    /** Sets the date represented by this component */
    def setDate(date: Date): Unit
  }
  object IDate {
    
    inline def apply(getDate: () => Date, setDate: Date => Unit): IDate = {
      val __obj = js.Dynamic.literal(getDate = js.Any.fromFunction0(getDate), setDate = js.Any.fromFunction1(setDate))
      __obj.asInstanceOf[IDate]
    }
    
    extension [Self <: IDate](x: Self) {
      
      inline def setGetDate(value: () => Date): Self = StObject.set(x, "getDate", js.Any.fromFunction0(value))
      
      inline def setSetDate(value: Date => Unit): Self = StObject.set(x, "setDate", js.Any.fromFunction1(value))
    }
  }
  
  trait IDateComp
    extends StObject
       with IComponent[IDateParams]
       with IDate
  object IDateComp {
    
    inline def apply(getDate: () => Date, getGui: () => HTMLElement, setDate: Date => Unit): IDateComp = {
      val __obj = js.Dynamic.literal(getDate = js.Any.fromFunction0(getDate), getGui = js.Any.fromFunction0(getGui), setDate = js.Any.fromFunction1(setDate))
      __obj.asInstanceOf[IDateComp]
    }
  }
  
  trait IDateParams extends StObject {
    
    var filterParams: IDateFilterParams
    
    /** Method for component to tell ag-Grid that the date has changed. */
    def onDateChanged(): Unit
  }
  object IDateParams {
    
    inline def apply(filterParams: IDateFilterParams, onDateChanged: () => Unit): IDateParams = {
      val __obj = js.Dynamic.literal(filterParams = filterParams.asInstanceOf[js.Any], onDateChanged = js.Any.fromFunction0(onDateChanged))
      __obj.asInstanceOf[IDateParams]
    }
    
    extension [Self <: IDateParams](x: Self) {
      
      inline def setFilterParams(value: IDateFilterParams): Self = StObject.set(x, "filterParams", value.asInstanceOf[js.Any])
      
      inline def setOnDateChanged(value: () => Unit): Self = StObject.set(x, "onDateChanged", js.Any.fromFunction0(value))
    }
  }
}
