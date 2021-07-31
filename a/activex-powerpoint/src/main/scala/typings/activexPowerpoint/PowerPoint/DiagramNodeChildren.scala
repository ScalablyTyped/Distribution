package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoDiagramNodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramNodeChildren extends StObject {
  
  /**
    * @param any [Index=-1]
    * @param Office.MsoDiagramNodeType [NodeType=1]
    */
  def AddNode(): DiagramNode = js.native
  def AddNode(Index: js.Any): DiagramNode = js.native
  def AddNode(Index: js.Any, NodeType: MsoDiagramNodeType): DiagramNode = js.native
  def AddNode(Index: Unit, NodeType: MsoDiagramNodeType): DiagramNode = js.native
  
  val Application: js.Any = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  val FirstChild: DiagramNode = js.native
  
  def Item(Index: js.Any): DiagramNode = js.native
  
  val LastChild: DiagramNode = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.DiagramNodeChildren_typekey")
  var PowerPointDotDiagramNodeChildren_typekey: DiagramNodeChildren = js.native
  
  def SelectAll(): Unit = js.native
}
