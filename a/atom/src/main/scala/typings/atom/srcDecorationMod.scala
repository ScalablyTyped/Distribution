package typings.atom

import typings.atom.atomStrings.`line-number`
import typings.atom.atomStrings.after
import typings.atom.atomStrings.before
import typings.atom.atomStrings.block
import typings.atom.atomStrings.cursor_
import typings.atom.atomStrings.gutter
import typings.atom.atomStrings.head
import typings.atom.atomStrings.highlight
import typings.atom.atomStrings.line
import typings.atom.atomStrings.overlay
import typings.atom.atomStrings.tail
import typings.atom.atomStrings.text
import typings.atom.dependenciesTextBufferSrcDisplayMarkerMod.DisplayMarker
import typings.atom.mod.Disposable
import typings.atom.srcOtherTypesMod.DecorationPropsChangedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcDecorationMod {
  
  @js.native
  trait Decoration extends StObject {
    
    // Construction and Destruction
    /**
      *  Destroy this marker decoration.
      *  You can also destroy the marker if you own it, which will destroy this decoration.
      */
    def destroy(): Unit = js.native
    
    // Decoration Details
    /** An id unique across all Decoration objects. */
    def getId(): Double = js.native
    
    /** Returns the marker associated with this Decoration. */
    def getMarker(): DisplayMarker = js.native
    
    // Properties
    /** Returns the Decoration's properties. */
    def getProperties(): DecorationOptions = js.native
    
    /** The identifier for this Decoration. */
    val id: Double = js.native
    
    /**
      *  Check if this decoration is of the given type.
      *  @param type A decoration type, such as `line-number` or `line`. This may also
      *  be an array of decoration types, with isType returning true if the decoration's
      *  type matches any in the array.
      */
    def isType(`type`: String): Boolean = js.native
    def isType(`type`: js.Array[String]): Boolean = js.native
    
    // Event Subscription
    /** When the Decoration is updated via Decoration::setProperties. */
    def onDidChangeProperties(callback: js.Function1[/* event */ DecorationPropsChangedEvent, Unit]): Disposable = js.native
    
    /** Invoke the given callback when the Decoration is destroyed. */
    def onDidDestroy(callback: js.Function0[Unit]): Disposable = js.native
    
    /**
      *  Update the marker with new Properties. Allows you to change the decoration's
      *  class.
      */
    def setProperties(newProperties: DecorationOptions): Unit = js.native
  }
  
  trait DecorationLayerOptions
    extends StObject
       with SharedDecorationOptions {
    
    /** One of several supported decoration types. */
    var `type`: js.UndefOr[line | `line-number` | text | highlight | block | cursor_] = js.undefined
  }
  object DecorationLayerOptions {
    
    inline def apply(): DecorationLayerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecorationLayerOptions]
    }
    
    extension [Self <: DecorationLayerOptions](x: Self) {
      
      inline def setType(value: line | `line-number` | text | highlight | block | cursor_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DecorationOptions
    extends StObject
       with SharedDecorationOptions {
    
    /** The name of the gutter we're decorating, if type is "gutter". */
    var gutterName: js.UndefOr[String] = js.undefined
    
    /** One of several supported decoration types. */
    var `type`: js.UndefOr[line | `line-number` | text | highlight | overlay | gutter | block | cursor_] = js.undefined
  }
  object DecorationOptions {
    
    inline def apply(): DecorationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecorationOptions]
    }
    
    extension [Self <: DecorationOptions](x: Self) {
      
      inline def setGutterName(value: String): Self = StObject.set(x, "gutterName", value.asInstanceOf[js.Any])
      
      inline def setGutterNameUndefined: Self = StObject.set(x, "gutterName", js.undefined)
      
      inline def setType(value: line | `line-number` | text | highlight | overlay | gutter | block | cursor_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait SharedDecorationOptions extends StObject {
    
    /**
      *  Only applicable to decorations of type overlay. Determines whether the decoration
      *  adjusts its horizontal or vertical position to remain fully visible when it would
      *  otherwise overflow the editor. Defaults to true.
      */
    var avoidOverflow: js.UndefOr[Boolean] = js.undefined
    
    /**
      *  This CSS class will be applied to the decorated line number, line, highlight,
      *  or overlay.
      */
    var `class`: js.UndefOr[String] = js.undefined
    
    /**
      *  An HTMLElement or a model Object with a corresponding view registered. Only
      *  applicable to the gutter, overlay and block types.
      */
    var item: js.UndefOr[js.Object] = js.undefined
    
    /**
      *  If false, the decoration will be applied to the last row of a non-empty
      *  range, even if it ends at column 0. Defaults to true. Only applicable
      *  to the gutter, line, and line-number decoration types.
      */
    var omitEmptyLastRow: js.UndefOr[Boolean] = js.undefined
    
    /**
      *  If true, the decoration will only be applied if the associated DisplayMarker
      *  is empty. Only applicable to the gutter, line, and line-number types.
      */
    var onlyEmpty: js.UndefOr[Boolean] = js.undefined
    
    /**
      *  If true, the decoration will only be applied to the head of the DisplayMarker.
      *  Only applicable to the line and line-number types.
      */
    var onlyHead: js.UndefOr[Boolean] = js.undefined
    
    /**
      *  If true, the decoration will only be applied if the associated DisplayMarker
      *  is non-empty. Only applicable to the gutter, line, and line-number types.
      */
    var onlyNonEmpty: js.UndefOr[Boolean] = js.undefined
    
    /**
      *  Only applicable to decorations of type block. Controls where the view is
      *  positioned relative to other block decorations at the same screen row.
      *  If unspecified, block decorations render oldest to newest.
      */
    var order: js.UndefOr[Double] = js.undefined
    
    /**
      *  Only applicable to decorations of type overlay and block. Controls where the
      *  view is positioned relative to the TextEditorMarker. Values can be
      *  'head' (the default) or 'tail' for overlay decorations, and 'before' (the default)
      *  or 'after' for block decorations.
      */
    var position: js.UndefOr[head | tail | before | after] = js.undefined
    
    /**
      *  An Object containing CSS style properties to apply to the relevant DOM
      *  node. Currently this only works with a type of cursor or text.
      */
    var style: js.UndefOr[js.Object] = js.undefined
  }
  object SharedDecorationOptions {
    
    inline def apply(): SharedDecorationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedDecorationOptions]
    }
    
    extension [Self <: SharedDecorationOptions](x: Self) {
      
      inline def setAvoidOverflow(value: Boolean): Self = StObject.set(x, "avoidOverflow", value.asInstanceOf[js.Any])
      
      inline def setAvoidOverflowUndefined: Self = StObject.set(x, "avoidOverflow", js.undefined)
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      inline def setItem(value: js.Object): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      inline def setOmitEmptyLastRow(value: Boolean): Self = StObject.set(x, "omitEmptyLastRow", value.asInstanceOf[js.Any])
      
      inline def setOmitEmptyLastRowUndefined: Self = StObject.set(x, "omitEmptyLastRow", js.undefined)
      
      inline def setOnlyEmpty(value: Boolean): Self = StObject.set(x, "onlyEmpty", value.asInstanceOf[js.Any])
      
      inline def setOnlyEmptyUndefined: Self = StObject.set(x, "onlyEmpty", js.undefined)
      
      inline def setOnlyHead(value: Boolean): Self = StObject.set(x, "onlyHead", value.asInstanceOf[js.Any])
      
      inline def setOnlyHeadUndefined: Self = StObject.set(x, "onlyHead", js.undefined)
      
      inline def setOnlyNonEmpty(value: Boolean): Self = StObject.set(x, "onlyNonEmpty", value.asInstanceOf[js.Any])
      
      inline def setOnlyNonEmptyUndefined: Self = StObject.set(x, "onlyNonEmpty", js.undefined)
      
      inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setPosition(value: head | tail | before | after): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
