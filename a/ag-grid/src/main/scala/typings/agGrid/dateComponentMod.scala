package typings.agGrid

import typings.agGrid.dateFilterMod.IDateFilterParams
import typings.agGrid.iComponentMod.IComponent
import typings.std.Date
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateComponentMod {
  
  @js.native
  trait IDate extends StObject {
    
    /** Returns the current date represented by this editor */
    def getDate(): Date = js.native
    
    /** Sets the date represented by this component */
    def setDate(date: Date): Unit = js.native
  }
  object IDate {
    
    @scala.inline
    def apply(getDate: () => Date, setDate: Date => Unit): IDate = {
      val __obj = js.Dynamic.literal(getDate = js.Any.fromFunction0(getDate), setDate = js.Any.fromFunction1(setDate))
      __obj.asInstanceOf[IDate]
    }
    
    @scala.inline
    implicit class IDateMutableBuilder[Self <: IDate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetDate(value: () => Date): Self = StObject.set(x, "getDate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetDate(value: Date => Unit): Self = StObject.set(x, "setDate", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IDateComp
    extends IComponent[IDateParams]
       with IDate
  object IDateComp {
    
    @scala.inline
    def apply(getDate: () => Date, getGui: () => HTMLElement, setDate: Date => Unit): IDateComp = {
      val __obj = js.Dynamic.literal(getDate = js.Any.fromFunction0(getDate), getGui = js.Any.fromFunction0(getGui), setDate = js.Any.fromFunction1(setDate))
      __obj.asInstanceOf[IDateComp]
    }
  }
  
  @js.native
  trait IDateParams extends StObject {
    
    var filterParams: IDateFilterParams = js.native
    
    /** Method for component to tell ag-Grid that the date has changed. */
    def onDateChanged(): Unit = js.native
  }
  object IDateParams {
    
    @scala.inline
    def apply(filterParams: IDateFilterParams, onDateChanged: () => Unit): IDateParams = {
      val __obj = js.Dynamic.literal(filterParams = filterParams.asInstanceOf[js.Any], onDateChanged = js.Any.fromFunction0(onDateChanged))
      __obj.asInstanceOf[IDateParams]
    }
    
    @scala.inline
    implicit class IDateParamsMutableBuilder[Self <: IDateParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilterParams(value: IDateFilterParams): Self = StObject.set(x, "filterParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDateChanged(value: () => Unit): Self = StObject.set(x, "onDateChanged", js.Any.fromFunction0(value))
    }
  }
}
