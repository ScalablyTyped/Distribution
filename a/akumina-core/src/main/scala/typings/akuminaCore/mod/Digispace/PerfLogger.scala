package typings.akuminaCore.mod.Digispace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("akumina-core", "Digispace.PerfLogger")
@js.native
class PerfLogger () extends StObject
object PerfLogger {
  
  @JSImport("akumina-core", "Digispace.PerfLogger")
  @js.native
  val ^ : js.Any = js.native
  
  /** Add LoaderMark and mark it start
    * @param mark String Name of mark to be added as Start
    * @param type String
    */
  /* static member */
  @scala.inline
  def AddLoaderStartMark(mark: String, `type`: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("AddLoaderStartMark")(mark.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Mark Stop of a LoaderMark
    * @param mark String Name of mark to be marked as Stop
    */
  /* static member */
  @scala.inline
  def AddLoaderStopMark(mark: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("AddLoaderStopMark")(mark.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** To add a new mark
    * @param mark String name of mark
    */
  /* static member */
  @scala.inline
  def AddMark(mark: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("AddMark")(mark.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** Measure Performance between two marks
    * @param mark1 Name of mark to compare
    * @param mark2 Name of mark to compare
    * @returns PerformanceMeasure Object
    */
  /* static member */
  @scala.inline
  def CompareMarks(mark1: String, mark2: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("CompareMarks")(mark1.asInstanceOf[js.Any], mark2.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /** Gets color from time
    * @param time time in ms
    * @param type short,medium,long
    * @returns yellow green or red
    */
  /* static member */
  @scala.inline
  def GetColor(time: Double, `type`: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("GetColor")(time.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /** Get list of all Loader Marks
    * @returns Array of Loader marks object
    */
  /* static member */
  @scala.inline
  def GetLoaderMarks(): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetLoaderMarks")().asInstanceOf[js.Array[js.Any]]
  
  /** Get a mark object by mark name
    * @param mark string name of mark
    * @returns object of mark {name: "string", startTime: decimal}
    */
  /* static member */
  @scala.inline
  def GetMark(mark: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetMark")(mark.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** Get List of marks added
    * @returns Array of mark objects [{name: "string", startTime: decimal}]
    */
  /* static member */
  @scala.inline
  def GetMarks(): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetMarks")().asInstanceOf[js.Array[js.Any]]
}
