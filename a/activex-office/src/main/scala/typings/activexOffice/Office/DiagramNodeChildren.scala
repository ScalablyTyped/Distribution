package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramNodeChildren extends StObject {
  
  def apply(Index: Any): DiagramNode = js.native
  
  /**
    * @param Index [Index=-1]
    * @param NodeType [NodeType=1]
    */
  def AddNode(): DiagramNode = js.native
  def AddNode(Index: Any): DiagramNode = js.native
  def AddNode(Index: Any, NodeType: MsoDiagramNodeType): DiagramNode = js.native
  def AddNode(Index: Unit, NodeType: MsoDiagramNodeType): DiagramNode = js.native
  
  val Application: Any = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  val FirstChild: DiagramNode = js.native
  
  def Item(Index: Any): DiagramNode = js.native
  
  val LastChild: DiagramNode = js.native
  
  val Parent: Any = js.native
  
  def SelectAll(): Unit = js.native
}
