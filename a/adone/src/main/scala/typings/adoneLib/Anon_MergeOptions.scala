package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_MergeOptions
  extends org.scalablytyped.runtime.Instantiable0[adoneLib.adoneNs.streamNs.coreNs.Stream[js.Object, js.Object]]
     with org.scalablytyped.runtime.Instantiable1[
      /* source */ adoneLib.adoneNs.streamNs.coreNs.INs.Source[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam S */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any
      ], 
      adoneLib.adoneNs.streamNs.coreNs.Stream[js.Object, js.Object]
    ]
     with org.scalablytyped.runtime.Instantiable2[
      /* source */ adoneLib.adoneNs.streamNs.coreNs.INs.Source[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam S */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any
      ], 
      /* options */ adoneLib.adoneNs.streamNs.coreNs.INs.ConstructorOptions[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam S */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any
      ], 
      adoneLib.adoneNs.streamNs.coreNs.Stream[js.Object, js.Object]
    ] {
   // ??
  /**
    * Merges the given stream into a core stream
    */
  def merge[S, T](
    streams: js.Array[
      (adoneLib.adoneNs.streamNs.coreNs.Stream[_, _]) | nodeLib.streamMod.Transform | nodeLib.streamMod.Readable | nodeLib.streamMod.Duplex
    ]
  ): adoneLib.adoneNs.streamNs.coreNs.Stream[S, T] = js.native
  def merge[S, T](
    streams: js.Array[
      (adoneLib.adoneNs.streamNs.coreNs.Stream[_, _]) | nodeLib.streamMod.Transform | nodeLib.streamMod.Readable | nodeLib.streamMod.Duplex
    ],
    options: Anon_EndSourceOptions[S, T]
  ): adoneLib.adoneNs.streamNs.coreNs.Stream[S, T] = js.native
}

