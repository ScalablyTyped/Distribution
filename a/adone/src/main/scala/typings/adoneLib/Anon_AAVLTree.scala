package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AAVLTree extends js.Object {
  /**
    * Represents an AVL tree, a self-balancing binary search tree
    */
  var AVLTree: org.scalablytyped.runtime.Instantiable1[
    /* options */ js.UndefOr[
      /* options */ adoneLib.adoneNs.collectionNs.INs.BinarySearchTreeNs.ConstructorOptions[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any, 
        adoneLib.adoneNs.collectionNs.AVLTree[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any
        ]
      ]
    ], 
    adoneLib.adoneNs.collectionNs.AVLTree[js.Object, js.Object]
  ]
  /**
    * Respresetns a data structure which is a combination of an array and a set.
    * Adding a new member is O(1), testing for membership is O(1),
    * and finding the index of an element is O(1).
    */
  var ArraySet: Anon_AllowDuplicates
  /**
    * Represents an asynchronous queue, each pop is a promise
    * that is resolved with an existing element or an element that will be pushed in the future
    */
  var AsyncQueue: org.scalablytyped.runtime.Instantiable0[adoneLib.adoneNs.collectionNs.AsyncQueue[js.Object]]
  /**
    * Represents a binary search tree
    */
  var BinarySearchTree: org.scalablytyped.runtime.Instantiable1[
    /* options */ js.UndefOr[
      /* options */ adoneLib.adoneNs.collectionNs.INs.BinarySearchTreeNs.ConstructorOptions[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any, 
        adoneLib.adoneNs.collectionNs.BinarySearchTree[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any
        ]
      ]
    ], 
    adoneLib.adoneNs.collectionNs.BinarySearchTree[js.Object, js.Object]
  ]
  /**
    * Represents a Node.js Buffer list collector, reader and streamer with callback/promise interface support
    */
  var BufferList: org.scalablytyped.runtime.Instantiable0[adoneLib.adoneNs.collectionNs.BufferList]
  /**
    * Represents an array of bytes, enhanced Node.js Buffer
    */
  var ByteArray: Anon_Accessor
  /**
    * Represents a Map that has a default values factory object or function.
    * Each get of non-existent key goes through the factory
    */
  var DefaultMap: org.scalablytyped.runtime.Instantiable2[
    /* factory */ js.UndefOr[
      /* factory */ (js.Function1[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ /* key */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any
      ]) | (org.scalablytyped.runtime.StringDictionary[/* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any])
    ], 
    /* iterable */ js.UndefOr[
      /* iterable */ nodeLib.Iterable[
        js.Tuple2[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any
        ]
      ]
    ], 
    adoneLib.adoneNs.collectionNs.DefaultMap[js.Object, js.Object]
  ]
  /**
    * Represents a faster LRU cache but with less functionality
    */
  var FastLRU: org.scalablytyped.runtime.Instantiable1[
    /* options */ js.UndefOr[/* options */ Anon_DisposeKey], 
    adoneLib.adoneNs.collectionNs.FastLRU[js.Object, js.Object]
  ]
  val INs: Anon_BinarySearchTree
  /**
    * Represent an LRU cache
    */
  var LRU: org.scalablytyped.runtime.Instantiable1[
    /* options */ js.UndefOr[
      /* options */ adoneLib.adoneNs.collectionNs.INs.LRUNs.ConstructorOptions[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any
      ]
    ], 
    adoneLib.adoneNs.collectionNs.LRU[js.Object, js.Object]
  ]
  /**
    * Represents a linked list
    */
  var LinkedList: Anon_DEFAULTLENGTH
  var MapCache: org.scalablytyped.runtime.Instantiable0[adoneLib.adoneNs.collectionNs.MapCache[js.Object]]
  var NSCache: org.scalablytyped.runtime.Instantiable2[
    /* maxSize */ scala.Double, 
    /* namespaces */ js.Array[java.lang.String], 
    adoneLib.adoneNs.collectionNs.NSCache[js.Object]
  ]
  /**
    * Represents a priority queue
    */
  var PriorityQueue: Anon_FromIterable
  /**
    * Represents a queue
    */
  var Queue: Anon_FromIterableLength
  /**
    * Represents a fully persistent red-black tree
    */
  var RedBlackTree: org.scalablytyped.runtime.Instantiable2[
    /* compare */ js.UndefOr[
      /* compare */ js.Function2[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ /* a */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ /* b */ js.Any, 
        scala.Double
      ]
    ], 
    /* root */ js.UndefOr[
      /* root */ adoneLib.adoneNs.collectionNs.RedBlackTree[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any
      ]
    ], 
    adoneLib.adoneNs.collectionNs.RedBlackTree[js.Object, js.Object]
  ]
  var RefcountedCache: org.scalablytyped.runtime.Instantiable0[adoneLib.adoneNs.collectionNs.RefcountedCache[js.Object]]
  var Set: org.scalablytyped.runtime.Instantiable1[
    /* key */ js.UndefOr[
      /* key */ js.Function1[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ /* x */ js.Any, 
        js.Any
      ]
    ], 
    adoneLib.adoneNs.collectionNs.Set[js.Object]
  ]
  /**
    * Represents a stack
    */
  var Stack: Anon_FromIterableAny
  /**
    * Represents a Map that keeps keys only for a specified interval of time
    */
  var TimeMap: org.scalablytyped.runtime.Instantiable2[
    /* timeout */ js.UndefOr[/* timeout */ scala.Double], 
    /* callback */ js.UndefOr[
      /* callback */ js.Function1[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ /* key */ js.Any, 
        scala.Unit
      ]
    ], 
    adoneLib.adoneNs.collectionNs.TimeMap[js.Object, js.Object]
  ]
}

