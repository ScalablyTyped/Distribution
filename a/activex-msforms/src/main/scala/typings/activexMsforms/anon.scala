package typings.activexMsforms

import typings.activexMsforms.MSForms.ReturnBoolean
import typings.activexMsforms.MSForms.ReturnInteger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Button extends StObject {
    
    val Button: Double
    
    val Shift: Double
    
    val X: Double
    
    val Y: Double
  }
  object Button {
    
    inline def apply(Button: Double, Shift: Double, X: Double, Y: Double): Button = {
      val __obj = js.Dynamic.literal(Button = Button.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Button]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Button] (val x: Self) extends AnyVal {
      
      inline def setButton(value: Double): Self = StObject.set(x, "Button", value.asInstanceOf[js.Any])
      
      inline def setShift(value: Double): Self = StObject.set(x, "Shift", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Cancel extends StObject {
    
    val Cancel: ReturnBoolean
  }
  object Cancel {
    
    inline def apply(Cancel: ReturnBoolean): Cancel = {
      val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cancel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cancel] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: ReturnBoolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    }
  }
  
  trait CancelIndex extends StObject {
    
    val Cancel: ReturnBoolean
    
    val Index: Double
  }
  object CancelIndex {
    
    inline def apply(Cancel: ReturnBoolean, Index: Double): CancelIndex = {
      val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any])
      __obj.asInstanceOf[CancelIndex]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CancelIndex] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: ReturnBoolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    }
  }
  
  trait Control extends StObject {
    
    val Control: typings.activexMsforms.MSForms.Control
  }
  object Control {
    
    inline def apply(Control: typings.activexMsforms.MSForms.Control): Control = {
      val __obj = js.Dynamic.literal(Control = Control.asInstanceOf[js.Any])
      __obj.asInstanceOf[Control]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Control] (val x: Self) extends AnyVal {
      
      inline def setControl(value: typings.activexMsforms.MSForms.Control): Self = StObject.set(x, "Control", value.asInstanceOf[js.Any])
    }
  }
  
  trait Index extends StObject {
    
    val Control: typings.activexMsforms.MSForms.Control
    
    val Index: Double
  }
  object Index {
    
    inline def apply(Control: typings.activexMsforms.MSForms.Control, Index: Double): Index = {
      val __obj = js.Dynamic.literal(Control = Control.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
      
      inline def setControl(value: typings.activexMsforms.MSForms.Control): Self = StObject.set(x, "Control", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    }
  }
  
  trait IndexNumber extends StObject {
    
    val Index: Double
  }
  object IndexNumber {
    
    inline def apply(Index: Double): IndexNumber = {
      val __obj = js.Dynamic.literal(Index = Index.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndexNumber]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IndexNumber] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    }
  }
  
  trait IndexPercent extends StObject {
    
    val Index: Double
    
    var Percent: Double
  }
  object IndexPercent {
    
    inline def apply(Index: Double, Percent: Double): IndexPercent = {
      val __obj = js.Dynamic.literal(Index = Index.asInstanceOf[js.Any], Percent = Percent.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndexPercent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IndexPercent] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
      
      inline def setPercent(value: Double): Self = StObject.set(x, "Percent", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeyAscii extends StObject {
    
    val KeyAscii: ReturnInteger
  }
  object KeyAscii {
    
    inline def apply(KeyAscii: ReturnInteger): KeyAscii = {
      val __obj = js.Dynamic.literal(KeyAscii = KeyAscii.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyAscii]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyAscii] (val x: Self) extends AnyVal {
      
      inline def setKeyAscii(value: ReturnInteger): Self = StObject.set(x, "KeyAscii", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeyCode extends StObject {
    
    val KeyCode: ReturnInteger
    
    val Shift: Double
  }
  object KeyCode {
    
    inline def apply(KeyCode: ReturnInteger, Shift: Double): KeyCode = {
      val __obj = js.Dynamic.literal(KeyCode = KeyCode.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyCode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyCode] (val x: Self) extends AnyVal {
      
      inline def setKeyCode(value: ReturnInteger): Self = StObject.set(x, "KeyCode", value.asInstanceOf[js.Any])
      
      inline def setShift(value: Double): Self = StObject.set(x, "Shift", value.asInstanceOf[js.Any])
    }
  }
  
  trait Percent extends StObject {
    
    var Percent: Double
  }
  object Percent {
    
    inline def apply(Percent: Double): Percent = {
      val __obj = js.Dynamic.literal(Percent = Percent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Percent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Percent] (val x: Self) extends AnyVal {
      
      inline def setPercent(value: Double): Self = StObject.set(x, "Percent", value.asInstanceOf[js.Any])
    }
  }
  
  trait Shift extends StObject {
    
    val Button: Double
    
    val Index: Double
    
    val Shift: Double
    
    val X: Double
    
    val Y: Double
  }
  object Shift {
    
    inline def apply(Button: Double, Index: Double, Shift: Double, X: Double, Y: Double): Shift = {
      val __obj = js.Dynamic.literal(Button = Button.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Shift]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Shift] (val x: Self) extends AnyVal {
      
      inline def setButton(value: Double): Self = StObject.set(x, "Button", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
      
      inline def setShift(value: Double): Self = StObject.set(x, "Shift", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
    }
  }
}
