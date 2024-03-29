package typings.atom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusBarMod {
  
  trait AddTileOptions extends StObject {
    
    /**
      *  A DOM element, a jQuery object, or a model object for which a view provider
      *  has been registered in the the view registry.
      */
    var item: js.Object
    
    /**
      *  Determines the placement of the tile within the status bar. Lower priority
      *  will result in closer placement to the anchor.
      */
    var priority: Double
  }
  object AddTileOptions {
    
    inline def apply(item: js.Object, priority: Double): AddTileOptions = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddTileOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AddTileOptions] (val x: Self) extends AnyVal {
      
      inline def setItem(value: js.Object): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    }
  }
  
  trait StatusBar extends StObject {
    
    /**
      *  Add a tile to the left side of the status bar. Lower priority tiles are placed
      *  further to the left.
      */
    def addLeftTile(options: AddTileOptions): Tile
    
    /**
      *  Add a tile to the right side of the status bar. Lower priority tiles are placed
      *  further to the right.
      */
    def addRightTile(options: AddTileOptions): Tile
    
    /** Retrieve all of the tiles on the left side of the status bar. */
    def getLeftTiles(): js.Array[Tile]
    
    /** Retrieve all of the tiles on the right side of the status bar. */
    def getRightTiles(): js.Array[Tile]
  }
  object StatusBar {
    
    inline def apply(
      addLeftTile: AddTileOptions => Tile,
      addRightTile: AddTileOptions => Tile,
      getLeftTiles: () => js.Array[Tile],
      getRightTiles: () => js.Array[Tile]
    ): StatusBar = {
      val __obj = js.Dynamic.literal(addLeftTile = js.Any.fromFunction1(addLeftTile), addRightTile = js.Any.fromFunction1(addRightTile), getLeftTiles = js.Any.fromFunction0(getLeftTiles), getRightTiles = js.Any.fromFunction0(getRightTiles))
      __obj.asInstanceOf[StatusBar]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StatusBar] (val x: Self) extends AnyVal {
      
      inline def setAddLeftTile(value: AddTileOptions => Tile): Self = StObject.set(x, "addLeftTile", js.Any.fromFunction1(value))
      
      inline def setAddRightTile(value: AddTileOptions => Tile): Self = StObject.set(x, "addRightTile", js.Any.fromFunction1(value))
      
      inline def setGetLeftTiles(value: () => js.Array[Tile]): Self = StObject.set(x, "getLeftTiles", js.Any.fromFunction0(value))
      
      inline def setGetRightTiles(value: () => js.Array[Tile]): Self = StObject.set(x, "getRightTiles", js.Any.fromFunction0(value))
    }
  }
  
  trait Tile extends StObject {
    
    /** Remove the Tile from the status bar. */
    def destroy(): Unit
    
    /** Retrieve the Tile's item. */
    def getItem(): js.Object
    
    /** Retrieve the priority that was assigned to the Tile when it was created. */
    def getPriority(): Double
  }
  object Tile {
    
    inline def apply(destroy: () => Unit, getItem: () => js.Object, getPriority: () => Double): Tile = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getItem = js.Any.fromFunction0(getItem), getPriority = js.Any.fromFunction0(getPriority))
      __obj.asInstanceOf[Tile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Tile] (val x: Self) extends AnyVal {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setGetItem(value: () => js.Object): Self = StObject.set(x, "getItem", js.Any.fromFunction0(value))
      
      inline def setGetPriority(value: () => Double): Self = StObject.set(x, "getPriority", js.Any.fromFunction0(value))
    }
  }
}
