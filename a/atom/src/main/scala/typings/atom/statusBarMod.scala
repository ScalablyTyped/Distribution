package typings.atom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusBarMod {
  
  @js.native
  trait AddTileOptions extends StObject {
    
    /**
      *  A DOM element, a jQuery object, or a model object for which a view provider
      *  has been registered in the the view registry.
      */
    var item: js.Object = js.native
    
    /**
      *  Determines the placement of the tile within the status bar. Lower priority
      *  will result in closer placement to the anchor.
      */
    var priority: Double = js.native
  }
  object AddTileOptions {
    
    @scala.inline
    def apply(item: js.Object, priority: Double): AddTileOptions = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddTileOptions]
    }
    
    @scala.inline
    implicit class AddTileOptionsMutableBuilder[Self <: AddTileOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItem(value: js.Object): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StatusBar extends StObject {
    
    /**
      *  Add a tile to the left side of the status bar. Lower priority tiles are placed
      *  further to the left.
      */
    def addLeftTile(options: AddTileOptions): Tile = js.native
    
    /**
      *  Add a tile to the right side of the status bar. Lower priority tiles are placed
      *  further to the right.
      */
    def addRightTile(options: AddTileOptions): Tile = js.native
    
    /** Retrieve all of the tiles on the left side of the status bar. */
    def getLeftTiles(): js.Array[Tile] = js.native
    
    /** Retrieve all of the tiles on the right side of the status bar. */
    def getRightTiles(): js.Array[Tile] = js.native
  }
  object StatusBar {
    
    @scala.inline
    def apply(
      addLeftTile: AddTileOptions => Tile,
      addRightTile: AddTileOptions => Tile,
      getLeftTiles: () => js.Array[Tile],
      getRightTiles: () => js.Array[Tile]
    ): StatusBar = {
      val __obj = js.Dynamic.literal(addLeftTile = js.Any.fromFunction1(addLeftTile), addRightTile = js.Any.fromFunction1(addRightTile), getLeftTiles = js.Any.fromFunction0(getLeftTiles), getRightTiles = js.Any.fromFunction0(getRightTiles))
      __obj.asInstanceOf[StatusBar]
    }
    
    @scala.inline
    implicit class StatusBarMutableBuilder[Self <: StatusBar] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddLeftTile(value: AddTileOptions => Tile): Self = StObject.set(x, "addLeftTile", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddRightTile(value: AddTileOptions => Tile): Self = StObject.set(x, "addRightTile", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetLeftTiles(value: () => js.Array[Tile]): Self = StObject.set(x, "getLeftTiles", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRightTiles(value: () => js.Array[Tile]): Self = StObject.set(x, "getRightTiles", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Tile extends StObject {
    
    /** Remove the Tile from the status bar. */
    def destroy(): Unit = js.native
    
    /** Retrieve the Tile's item. */
    def getItem(): js.Object = js.native
    
    /** Retrieve the priority that was assigned to the Tile when it was created. */
    def getPriority(): Double = js.native
  }
  object Tile {
    
    @scala.inline
    def apply(destroy: () => Unit, getItem: () => js.Object, getPriority: () => Double): Tile = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getItem = js.Any.fromFunction0(getItem), getPriority = js.Any.fromFunction0(getPriority))
      __obj.asInstanceOf[Tile]
    }
    
    @scala.inline
    implicit class TileMutableBuilder[Self <: Tile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetItem(value: () => js.Object): Self = StObject.set(x, "getItem", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPriority(value: () => Double): Self = StObject.set(x, "getPriority", js.Any.fromFunction0(value))
    }
  }
}
