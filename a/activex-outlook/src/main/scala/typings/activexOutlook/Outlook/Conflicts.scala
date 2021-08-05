package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Conflicts extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val Count: Double
  
  def GetFirst(): Conflict
  
  def GetLast(): Conflict
  
  def GetNext(): Conflict
  
  def GetPrevious(): Conflict
  
  def Item(Index: js.Any): Conflict
  
  /* private */ @JSName("Outlook.Conflicts_typekey")
  var OutlookDotConflicts_typekey: Conflicts
  
  val Parent: js.Any
  
  val Session: NameSpace
}
object Conflicts {
  
  inline def apply(
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    GetFirst: () => Conflict,
    GetLast: () => Conflict,
    GetNext: () => Conflict,
    GetPrevious: () => Conflict,
    Item: js.Any => Conflict,
    OutlookDotConflicts_typekey: Conflicts,
    Parent: js.Any,
    Session: NameSpace
  ): Conflicts = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], GetFirst = js.Any.fromFunction0(GetFirst), GetLast = js.Any.fromFunction0(GetLast), GetNext = js.Any.fromFunction0(GetNext), GetPrevious = js.Any.fromFunction0(GetPrevious), Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Conflicts_typekey")(OutlookDotConflicts_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conflicts]
  }
  
  extension [Self <: Conflicts](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setGetFirst(value: () => Conflict): Self = StObject.set(x, "GetFirst", js.Any.fromFunction0(value))
    
    inline def setGetLast(value: () => Conflict): Self = StObject.set(x, "GetLast", js.Any.fromFunction0(value))
    
    inline def setGetNext(value: () => Conflict): Self = StObject.set(x, "GetNext", js.Any.fromFunction0(value))
    
    inline def setGetPrevious(value: () => Conflict): Self = StObject.set(x, "GetPrevious", js.Any.fromFunction0(value))
    
    inline def setItem(value: js.Any => Conflict): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setOutlookDotConflicts_typekey(value: Conflicts): Self = StObject.set(x, "Outlook.Conflicts_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
