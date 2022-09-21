package typings.angularCompilerCli

import typings.angularCompilerCli.entryPointMod.EntryPoint
import typings.angularCompilerCli.tasksApiMod.PartiallyOrderedTasks
import typings.angularCompilerCli.tasksApiMod.Task
import typings.angularCompilerCli.tasksApiMod.TaskDependencies
import typings.dependencyGraph.mod.DepGraph
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tasksUtilsMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/execution/tasks/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeTaskDependencies(tasks: PartiallyOrderedTasks, graph: DepGraph[EntryPoint]): TaskDependencies = (^.asInstanceOf[js.Dynamic].applyDynamic("computeTaskDependencies")(tasks.asInstanceOf[js.Any], graph.asInstanceOf[js.Any])).asInstanceOf[TaskDependencies]
  
  inline def getBlockedTasks(dependencies: TaskDependencies): Map[Task, Set[Task]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockedTasks")(dependencies.asInstanceOf[js.Any]).asInstanceOf[Map[Task, Set[Task]]]
  
  inline def getDependentsSet(map: TaskDependencies, task: Task): Set[Task] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDependentsSet")(map.asInstanceOf[js.Any], task.asInstanceOf[js.Any])).asInstanceOf[Set[Task]]
  
  inline def sortTasksByPriority(tasks: PartiallyOrderedTasks, dependencies: TaskDependencies): PartiallyOrderedTasks = (^.asInstanceOf[js.Dynamic].applyDynamic("sortTasksByPriority")(tasks.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[PartiallyOrderedTasks]
  
  inline def stringifyTask(task: Task): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyTask")(task.asInstanceOf[js.Any]).asInstanceOf[String]
}
