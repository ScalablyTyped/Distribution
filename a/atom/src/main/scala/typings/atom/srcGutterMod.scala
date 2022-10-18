package typings.atom

import typings.atom.atomStrings.`line-number`
import typings.atom.atomStrings.decorated
import typings.atom.dependenciesTextBufferSrcDisplayMarkerMod.DisplayMarker
import typings.atom.mod.Disposable
import typings.atom.srcDecorationMod.Decoration
import typings.atom.srcDecorationMod.DecorationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGutterMod {
  
  trait Gutter extends StObject {
    
    /**
      *  Add a decoration that tracks a DisplayMarker. When the marker moves, is
      *  invalidated, or is destroyed, the decoration will be updated to reflect
      *  the marker's state.
      */
    def decorateMarker(marker: DisplayMarker, decorationParams: DecorationOptions): Decoration
    
    // Gutter Destruction
    /** Destroys the gutter. */
    def destroy(): Unit
    
    // Visibility
    /** Hide the gutter. */
    def hide(): Unit
    
    /** Determine whether the gutter is visible. */
    def isVisible(): Boolean
    
    // Event Subscription
    /** Calls your callback when the gutter's visibility changes. */
    def onDidChangeVisible(callback: js.Function1[/* gutter */ this.type, Unit]): Disposable
    
    /** Calls your callback when the gutter is destroyed. */
    def onDidDestroy(callback: js.Function0[Unit]): Disposable
    
    /** Show the gutter. */
    def show(): Unit
  }
  object Gutter {
    
    inline def apply(
      decorateMarker: (DisplayMarker, DecorationOptions) => Decoration,
      destroy: () => Unit,
      hide: () => Unit,
      isVisible: () => Boolean,
      onDidChangeVisible: js.Function1[Gutter, Unit] => Disposable,
      onDidDestroy: js.Function0[Unit] => Disposable,
      show: () => Unit
    ): Gutter = {
      val __obj = js.Dynamic.literal(decorateMarker = js.Any.fromFunction2(decorateMarker), destroy = js.Any.fromFunction0(destroy), hide = js.Any.fromFunction0(hide), isVisible = js.Any.fromFunction0(isVisible), onDidChangeVisible = js.Any.fromFunction1(onDidChangeVisible), onDidDestroy = js.Any.fromFunction1(onDidDestroy), show = js.Any.fromFunction0(show))
      __obj.asInstanceOf[Gutter]
    }
    
    extension [Self <: Gutter](x: Self) {
      
      inline def setDecorateMarker(value: (DisplayMarker, DecorationOptions) => Decoration): Self = StObject.set(x, "decorateMarker", js.Any.fromFunction2(value))
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setIsVisible(value: () => Boolean): Self = StObject.set(x, "isVisible", js.Any.fromFunction0(value))
      
      inline def setOnDidChangeVisible(value: js.Function1[Gutter, Unit] => Disposable): Self = StObject.set(x, "onDidChangeVisible", js.Any.fromFunction1(value))
      
      inline def setOnDidDestroy(value: js.Function0[Unit] => Disposable): Self = StObject.set(x, "onDidDestroy", js.Any.fromFunction1(value))
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  trait GutterOptions extends StObject {
    
    /** String added to the CSS classnames of the gutter's root DOM element. */
    var `class`: js.UndefOr[String] = js.undefined
    
    /**
      * Function called by a 'line-number' gutter to generate the label for each
      * line number element. Should return a String that will be used to label the
      * corresponding line.
      */
    var labelFn: js.UndefOr[js.Function1[/* lineData */ LineDataExtended, String]] = js.undefined
    
    /** (required) A unique String to identify this gutter. */
    var name: String
    
    /**
      * Function to be called when a mousedown event is received by a line-number
      * element within this type: 'line-number' Gutter. If unspecified, the default
      * behavior is to select the clicked buffer row.
      */
    var onMouseDown: js.UndefOr[js.Function1[/* lineData */ LineData, Unit]] = js.undefined
    
    /**
      * Function to be called when a mousemove event occurs on a line-number
      * element within within this type: 'line-number' Gutter.
      */
    var onMouseMove: js.UndefOr[js.Function1[/* lineData */ LineData, Unit]] = js.undefined
    
    /**
      * A Number that determines stacking order between gutters.
      * Lower priority items are forced closer to the edges of the window. (default: -100)
      */
    var priority: js.UndefOr[Double] = js.undefined
    
    /**
      * String specifying the type of gutter to create.
      * 'decorated' gutters are useful as a destination for decorations created with
      * Gutter::decorateMarker.
      * 'line-number' gutters.
      */
    var `type`: js.UndefOr[decorated | `line-number`] = js.undefined
    
    /**
      * Boolean specifying whether the gutter is visible initially after being created.
      * (default: true)
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object GutterOptions {
    
    inline def apply(name: String): GutterOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GutterOptions]
    }
    
    extension [Self <: GutterOptions](x: Self) {
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      inline def setLabelFn(value: /* lineData */ LineDataExtended => String): Self = StObject.set(x, "labelFn", js.Any.fromFunction1(value))
      
      inline def setLabelFnUndefined: Self = StObject.set(x, "labelFn", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOnMouseDown(value: /* lineData */ LineData => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseMove(value: /* lineData */ LineData => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setType(value: decorated | `line-number`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait LineData extends StObject {
    
    /** Number indicating the zero-indexed buffer index of a line. */
    var bufferRow: Double
    
    /** Number indicating the zero-indexed screen index. */
    var screenRow: Double
  }
  object LineData {
    
    inline def apply(bufferRow: Double, screenRow: Double): LineData = {
      val __obj = js.Dynamic.literal(bufferRow = bufferRow.asInstanceOf[js.Any], screenRow = screenRow.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineData]
    }
    
    extension [Self <: LineData](x: Self) {
      
      inline def setBufferRow(value: Double): Self = StObject.set(x, "bufferRow", value.asInstanceOf[js.Any])
      
      inline def setScreenRow(value: Double): Self = StObject.set(x, "screenRow", value.asInstanceOf[js.Any])
    }
  }
  
  trait LineDataExtended
    extends StObject
       with LineData {
    
    /** Boolean that is true if a fold may be created here. */
    var foldable: Boolean
    
    /** Number the maximum number of digits necessary to represent any known screen row. */
    var maxDigits: Double
    
    /** Boolean if this screen row is the soft-wrapped continuation of the same buffer row. */
    var softWrapped: Boolean
  }
  object LineDataExtended {
    
    inline def apply(bufferRow: Double, foldable: Boolean, maxDigits: Double, screenRow: Double, softWrapped: Boolean): LineDataExtended = {
      val __obj = js.Dynamic.literal(bufferRow = bufferRow.asInstanceOf[js.Any], foldable = foldable.asInstanceOf[js.Any], maxDigits = maxDigits.asInstanceOf[js.Any], screenRow = screenRow.asInstanceOf[js.Any], softWrapped = softWrapped.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineDataExtended]
    }
    
    extension [Self <: LineDataExtended](x: Self) {
      
      inline def setFoldable(value: Boolean): Self = StObject.set(x, "foldable", value.asInstanceOf[js.Any])
      
      inline def setMaxDigits(value: Double): Self = StObject.set(x, "maxDigits", value.asInstanceOf[js.Any])
      
      inline def setSoftWrapped(value: Boolean): Self = StObject.set(x, "softWrapped", value.asInstanceOf[js.Any])
    }
  }
}
